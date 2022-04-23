package com.mclowicz.recipes.data.repository

import com.mclowicz.recipes.data.network.RecipeApiService
import javax.inject.Inject

class RecipeRepository @Inject constructor(
    private val recipeApiService: RecipeApiService
) {

    fun fetchRecipeByCuisine(cuisine: String) = recipeApiService
        .fetchRecipeByCuisine(cuisine = cuisine)
}