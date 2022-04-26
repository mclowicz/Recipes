package com.mclowicz.recipes.data.model

data class RecipeViewModel(
    val id: Int,
    val title: String,
    val image: String,
    var isFavorite: Boolean = false
)

fun convertToRecipeViewModel(recipeResult: RecipeResult) = RecipeViewModel(
    id = recipeResult.id,
    title = recipeResult.title,
    image = recipeResult.image
)

fun convertToRecipeViewModel(recipeEntity: RecipeEntity) = RecipeViewModel(
    id = recipeEntity.id,
    title = recipeEntity.title,
    image = recipeEntity.image
)

fun convertToRecipeEntity(recipeViewModel: RecipeViewModel) = RecipeEntity(
    id = recipeViewModel.id,
    title = recipeViewModel.title,
    image = recipeViewModel.image
)
