package com.mclowicz.recipes.data.repository

import com.mclowicz.recipes.data.database.RecipeDaoService
import com.mclowicz.recipes.data.model.RecipeEntity
import com.mclowicz.recipes.data.network.RecipeApiService
import javax.inject.Inject

class RecipeRepository @Inject constructor(
    private val recipeApiService: RecipeApiService,
    private val recipeDaoService: RecipeDaoService
) {

    fun fetchRecipeByCuisine(cuisine: String) = recipeApiService
        .fetchRecipeByCuisine(cuisine = cuisine)

    fun getFavoritesRecipes() = recipeDaoService.getFavoriteRecipes()

    suspend fun removeFromFavorite(recipe: RecipeEntity) = recipeDaoService.removeFromFavorite(recipe = recipe)

    suspend fun addToFavorites(recipe: RecipeEntity) = recipeDaoService.addToFavorites(recipe = recipe)
}