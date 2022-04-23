package com.mclowicz.recipes.data.network

import com.mclowicz.recipes.data.model.RecipeResults
import retrofit2.http.GET
import retrofit2.http.Query

interface RecipeApi {

    @GET("complexSearch")
    suspend fun getByCuisine(
        @Query("cuisine") cuisine: String
    ): RecipeResults
}