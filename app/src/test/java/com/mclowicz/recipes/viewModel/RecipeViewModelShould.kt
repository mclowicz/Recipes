package com.mclowicz.recipes.viewModel

import com.mclowicz.recipes.data.exceptions.Exception
import com.mclowicz.recipes.data.model.RecipeResults
import com.mclowicz.recipes.data.repository.RecipeRepository
import com.mclowicz.recipes.presentation.main.MainVieState
import com.mclowicz.recipes.utils.BaseUnitTest
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test

@ExperimentalCoroutinesApi
class RecipeViewModelShould : BaseUnitTest() {

    private val loadingState = MainVieState.Loading
    private val emptyStateException = MainVieState.Error(Exception.EmptyException())
    private val unauthorizedException = MainVieState.Error(Exception.UnauthorizedException())
    private val serverException = MainVieState.Error(Exception.ServerException())

    private val recipeRepository: RecipeRepository = mock()

    @Test
    fun `return a list of recipes by given cuisine`() = runBlockingTest {

        whenever(recipeRepository.fetchRecipeByCuisine("Nordic")).thenReturn(
            flow {
                emit(
                    RecipeResults(
                        listOf()
                    )
                )
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