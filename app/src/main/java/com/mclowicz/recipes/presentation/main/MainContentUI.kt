package com.mclowicz.recipes.presentation.main

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.annotation.ExperimentalCoilApi
import com.mclowicz.recipes.data.model.RecipeResult

@ExperimentalCoilApi
@Composable
fun MainContentUI(
    data: List<RecipeResult>
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        LazyColumn() {
            items(items = data) {
                data.forEach { recipe ->
                    RecipeCardUI(data = recipe)
                }
            }
        }
    }
}