package com.mclowicz.recipes.presentation.favorite

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import com.mclowicz.recipes.data.model.RecipeViewModel

@ExperimentalCoilApi
@Composable
fun FavoriteContentUI(
    data: List<RecipeViewModel>,
    removeFavoriteClicked: (RecipeViewModel) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 46.dp)
    ) {
        LazyColumn() {
            items(items = data) { data ->
                FavoriteCardUI(
                    data = data,
                    onRemoveFavoriteClicked = removeFavoriteClicked
                )
            }
        }
    }
}