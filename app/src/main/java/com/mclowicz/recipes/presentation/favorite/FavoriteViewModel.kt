package com.mclowicz.recipes.presentation.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mclowicz.recipes.data.model.RecipeViewModel
import com.mclowicz.recipes.data.model.convertToRecipeEntity
import com.mclowicz.recipes.data.model.convertToRecipeViewModel
import com.mclowicz.recipes.data.repository.RecipeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(
    private val recipeRepository: RecipeRepository
) : ViewModel() {

    private val _viewState = MutableStateFlow<FavoriteViewState>(FavoriteViewState.Idle)
    val viewState = _viewState.asStateFlow()

    fun getFavorites() {
        viewModelScope.launch(Dispatchers.IO) {
            recipeRepository.getFavoritesRecipes()
                .collect { favorites ->
                    _viewState.update {
                        FavoriteViewState.Content(
                            data = favorites
                                .map { convertToRecipeViewModel(it) }.toMutableList()
                        )
                    }
                }
        }
    }

    fun onRemoveFromFavoriteClicked(recipeViewModel: RecipeViewModel) {
        viewModelScope.launch(Dispatchers.IO) {
            recipeRepository.removeFromFavorite(
                recipe = convertToRecipeEntity(recipeViewModel = recipeViewModel)
            )
            (_viewState.value as? FavoriteViewState.Content)?.let { content ->
                _viewState.update {
                    FavoriteViewState.Content(
                        data = content.data.apply { remove(recipeViewModel) }
                    )
                }
            }
        }
    }
}