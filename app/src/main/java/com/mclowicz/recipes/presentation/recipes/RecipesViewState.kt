package com.mclowicz.recipes.presentation.recipes

import com.mclowicz.recipes.data.exceptions.Exception
import com.mclowicz.recipes.data.model.RecipeViewModel

sealed class RecipesViewState {
    object Idle : RecipesViewState()
    object Loading : RecipesViewState()
    class Error(val exception: Exception) : RecipesViewState()
    class Content(val data: List<RecipeViewModel>) : RecipesViewState()
}

fun RecipesViewState.Content.updateFavoriteProduct(
    productId: Int,
    isFavorite: Boolean
): RecipesViewState.Content {
    return RecipesViewState.Content(data = this.data.map { viewState ->
        if (viewState.id == productId) {
            viewState.copy(isFavorite = isFavorite)
        } else {
            viewState
        }
    }
    )
}