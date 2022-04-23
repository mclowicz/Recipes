package com.mclowicz.recipes.data.network

import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RecipeApiService @Inject constructor(
    private val recipeApi: RecipeApi
) {

    fun fetchRecipeByCuisine(cuisine: String) = flow {
        emit(recipeApi.getByCuisine(cuisine))
    }
}