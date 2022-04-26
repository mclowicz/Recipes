package com.mclowicz.recipes.presentation.main

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import com.mclowicz.recipes.data.model.RecipeViewModel

@ExperimentalCoilApi
@Composable
fun RecipesContentUI(
    data: List<RecipeViewModel>,
    onFavoriteClicked: (RecipeViewModel) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 46.dp)
    ) {
        LazyColumn() {
            items(items = data) { data ->
                RecipeCardUI(
                    data = data,
                    onFavoriteClicked = onFavoriteClicked
                )
            }
        }
    }
}