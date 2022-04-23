package com.mclowicz.recipes.service

import com.mclowicz.recipes.data.network.RecipeApi
import com.mclowicz.recipes.data.network.RecipeApiService
import com.mclowicz.recipes.utils.BaseUnitTest
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.single
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class RecipeApiServiceShould: BaseUnitTest() {

    private val recipeApi: RecipeApi = mock()
    private lateinit var recipeApiService: RecipeApiService

    @Before
    fun setup() {
        recipeApiService = RecipeApiService(recipeApi = recipeApi)
    }

    @Test
    fun fetchByCuisine() = runBlockingTest {

        recipeApiService.fetchRecipeByCuisine("Nordic").single()

        verify(recipeApi, times(1)).getByCuisine("Nordic")
    }
}