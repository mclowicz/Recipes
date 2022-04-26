package com.mclowicz.recipes.presentation.recipes

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.annotation.ExperimentalCoilApi
import com.mclowicz.recipes.data.model.RecipeViewModel
import com.mclowicz.recipes.presentation.common.ErrorUI
import com.mclowicz.recipes.presentation.common.LoadingUI
import com.mclowicz.recipes.presentation.main.RecipesContentUI
import com.mclowicz.recipes.presentation.main.RecipesIdleUI

@ExperimentalCoilApi
@Composable
fun RecipesScreen(
    navController: NavController,
    recipesViewModel: RecipesViewModel = hiltViewModel()
) {
    val viewState = recipesViewModel.viewState.collectAsState().value
    val cuisine = "Nordic"
    val onFavoriteClicked: (RecipeViewModel) -> Unit = { recipe ->
        recipesViewModel.onFavoriteClicked(recipe)
    }
    LaunchedEffect(key1 = null){
        recipesViewModel.getFavorites()
    }
    when (viewState) {
        is RecipesViewState.Idle -> {
            RecipesIdleUI(
                fetchByCuisine = {
                    recipesViewModel.fetchRecipeByCuisine(cuisine)
                }
            )
        }
        is RecipesViewState.Loading -> {
            LoadingUI()
        }
        is RecipesViewState.Error -> {
            ErrorUI(exception = viewState.exception)
        }
        is RecipesViewState.Content -> {

            RecipesContentUI(
                data = viewState.data,
                onFavoriteClicked = onFavoriteClicked
            )
        }
    }
}