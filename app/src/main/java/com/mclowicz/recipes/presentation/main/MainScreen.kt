package com.mclowicz.recipes.presentation.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import coil.annotation.ExperimentalCoilApi
import com.mclowicz.recipes.MainViewModel
import com.mclowicz.recipes.presentation.common.ErrorUI
import com.mclowicz.recipes.presentation.common.LoadingUI

@ExperimentalCoilApi
@Composable
fun MainScreen(
    mainViewModel: MainViewModel = hiltViewModel()
) {
    val viewState = mainViewModel.viewState.collectAsState().value
    val cuisine = "Nordic"
    when (viewState) {
        is MainVieState.Idle -> {
            MainIdleUI(
                fetchByCuisine = {
                    mainViewModel.fetchRecipeByCuisine(cuisine)
                }
            )
        }
        is MainVieState.Loading -> {
            LoadingUI()
        }
        is MainVieState.Error -> {
            ErrorUI(exception = viewState.exception)
        }
        is MainVieState.Success -> {
            MainContentUI(data = viewState.data)
        }
    }
}