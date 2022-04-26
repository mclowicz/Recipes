package com.mclowicz.recipes.presentation.recipes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mclowicz.recipes.data.exceptions.Exception
import com.mclowicz.recipes.data.exceptions.handleException
import com.mclowicz.recipes.data.model.*
import com.mclowicz.recipes.data.repository.RecipeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipesViewModel @Inject constructor(
    private val recipeRepository: RecipeRepository
) : ViewModel() {

    private val _viewState = MutableStateFlow<RecipesViewState>(RecipesViewState.Idle)
    val viewState = _viewState.asStateFlow()

    private val _favorites = MutableStateFlow<MutableList<RecipeEntity>>(mutableListOf())

    fun fetchRecipeByCuisine(cuisine: String) {
        viewModelScope.launch(Dispatchers.IO) {
            recipeRepository.fetchRecipeByCuisine(cuisine)
                .onStart {
                    _viewState.value = RecipesViewState.Loading
                }
                .catch {
                    _viewState.value = RecipesViewState.Error(
                        exception = it.handleException()
                    )
                }
                .collect {
                    if (it.results.isEmpty()) {
                        _viewState.value =
                            RecipesViewState.Error(exception = Exception.EmptyException())
                    } else {
                        _viewState.value = RecipesViewState.Content(
                            data = it.results.map { recipeResult ->
                                val isFavorite = _favorites.value
                                    .find { it.id == recipeResult.id } == null
                                convertToRecipeViewModel(recipeResult = recipeResult).apply {
                                    this.isFavorite = !isFavorite
                                }
                            }
                        )
                    }
                }
        }
    }

    fun getFavorites() {
        viewModelScope.launch(Dispatchers.IO) {
            recipeRepository.getFavoritesRecipes()
                .collect {
                    _favorites.value = it.toMutableList()
                }
        }
    }

    fun onFavoriteClicked(recipeViewModel: RecipeViewModel) {
        viewModelScope.launch(Dispatchers.IO) {
            val favoriteRecipe = _favorites.value.find { recipeViewModel.id == it.id }
            if (favoriteRecipe != null) {
                _favorites.value.remove(favoriteRecipe)
                recipeRepository.removeFromFavorite(favoriteRecipe)
            } else {
                val recipeEntity = convertToRecipeEntity(recipeViewModel = recipeViewModel)
                _favorites.value.add(recipeEntity)
                recipeRepository.addToFavorites(
                    recipe = recipeEntity
                )
            }
            toggleFavorite(recipeViewModel)
        }
    }

    private fun toggleFavorite(recipeViewModel: RecipeViewModel) {
        (_viewState.value as? RecipesViewState.Content)?.let { content ->
            _viewState.update {
                content.updateFavoriteProduct(
                    recipeViewModel.id,
                    !recipeViewModel.isFavorite
                )
            }
        }
    }
}