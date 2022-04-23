package com.mclowicz.recipes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mclowicz.recipes.data.exceptions.Exception
import com.mclowicz.recipes.data.exceptions.handleException
import com.mclowicz.recipes.data.repository.RecipeRepository
import com.mclowicz.recipes.presentation.main.MainVieState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val recipeRepository: RecipeRepository
): ViewModel() {

    private val _viewState = MutableStateFlow<MainVieState>(MainVieState.Idle)
    val viewState = _viewState

    fun fetchRecipeByCuisine(cuisine: String) {
        viewModelScope.launch {
            recipeRepository.fetchRecipeByCuisine(cuisine)
                .onStart {
                    _viewState.value = MainVieState.Loading
                }
                .catch {
                    _viewState.value = MainVieState.Error(
                        exception = it.handleException()
                    )
                }
                .collect {
                    if (it.results.isEmpty()) {
                        _viewState.value = MainVieState.Error(exception = Exception.EmptyException())
                    } else {
                        _viewState.value = MainVieState.Success(data = it.results)
                    }
                }
        }
    }
}