package com.mclowicz.recipes.navigation

sealed class Screen(val title: String, val route: String) {
    object Recipes : Screen("Recipes", "recipes_screen")
    object Favorite : Screen("Favorite", "favorite_screen")
}