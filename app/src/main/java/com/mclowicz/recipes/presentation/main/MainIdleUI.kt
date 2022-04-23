package com.mclowicz.recipes.presentation.main

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainIdleUI(
    fetchByCuisine: () -> Unit
) {
    Button(
        modifier = Modifier.wrapContentSize(),
        onClick = { fetchByCuisine() }
    ) {
        Text(text = "Get By Cuisine")
    }
}