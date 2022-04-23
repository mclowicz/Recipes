package com.mclowicz.recipes.repository

import com.mclowicz.recipes.data.model.RecipeResults
import com.mclowicz.recipes.data.network.RecipeApiService
import com.mclowicz.recipes.data.repository.RecipeRepository
import com.mclowicz.recipes.utils.BaseUnitTest
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class RecipeRepositoryShould: BaseUnitTest() {

    private lateinit var recipeRepository: RecipeRepository
    private val recipeApiService: RecipeApiService = mock()

    @Before
    fun setup() {
        recipeRepository = RecipeRepository(recipeApiService)
    }

    @Test
    fun `return a list of recipes by given cuisine`() = runBlockingTest {

        whenever(recipeApiService.fetchRecipeByCuisine("Nordic")).thenReturn(
            flow {
                emit(RecipeResults(
                    listOf()
                ))
            }
        )

        assertEquals(
            RecipeResults(
                listOf()
            ),
            recipeRepository.fetchRecipeByCuisine("Nordic").first()
        )
    }
}