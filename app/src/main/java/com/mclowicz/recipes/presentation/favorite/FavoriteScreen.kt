package com.mclowicz.recipes.presentation.favorite

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.annotation.ExperimentalCoilApi
import com.mclowicz.recipes.data.model.RecipeViewModel
import com.mclowicz.recipes.presentation.common.LoadingUI
import com.mclowicz.recipes.presentation.main.RecipeCardUI

@ExperimentalCoilApi
@Composable
fun FavoriteScreen(
    navController: NavController,
    favoriteViewModel: FavoriteViewModel = hiltViewModel()
) {
    val viewState = favoriteViewModel.viewState.collectAsState().value
    val removeFavoriteClicked: (RecipeViewModel) -> Unit = { recipe ->
        favoriteViewModel.onRemoveFromFavoriteClicked(recipe)
    }
    LaunchedEffect(key1 = null) {
        favoriteViewModel.getFavorites()
    }
    when (viewState) {
        is FavoriteViewState.Idle -> {
            LoadingUI()
        }
        is FavoriteViewState.Content -> {
            FavoriteContentUI(
                data = viewState.data,
                removeFavoriteClicked = removeFavoriteClicked
            )
        }
    }
}