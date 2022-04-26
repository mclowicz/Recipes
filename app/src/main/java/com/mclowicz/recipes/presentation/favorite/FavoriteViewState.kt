package com.mclowicz.recipes.presentation.favorite

import com.mclowicz.recipes.data.model.RecipeViewModel

sealed class FavoriteViewState {
    object Idle : FavoriteViewState()
    class Content(val data: MutableList<RecipeViewModel>) : FavoriteViewState()
}
