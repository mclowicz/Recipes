package com.mclowicz.recipes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import coil.annotation.ExperimentalCoilApi
import com.mclowicz.recipes.presentation.favorite.FavoriteScreen
import com.mclowicz.recipes.presentation.recipes.RecipesScreen

@ExperimentalCoilApi
@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Recipes.route
    )
    {
        composable(Screen.Recipes.route) {
            RecipesScreen(navController = navHostController)
        }
        composable(Screen.Favorite.route) {
            FavoriteScreen(navController = navHostController)
        }
    }
}