package com.mclowicz.recipes.presentation.main

import com.mclowicz.recipes.data.exceptions.Exception
import com.mclowicz.recipes.data.model.RecipeResult

sealed class MainVieState {
    object Idle: MainVieState()
    object Loading: MainVieState()
    class Error(val exception: Exception): MainVieState()
    class Success(val data: List<RecipeResult>): MainVieState()
}