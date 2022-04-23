package com.mclowicz.recipes.data.model

data class RecipeResults(
    val results: List<RecipeResult>
)

data class RecipeResult(
    val id: Int,
    val title: String,
    val image: String,
    val imageType: String
)