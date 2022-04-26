package com.mclowicz.recipes.presentation.bottomNavBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import com.mclowicz.recipes.data.model.NavItem
import com.mclowicz.recipes.navigation.Screen

val BottomNavItems = listOf(
    NavItem(
        label = Screen.Recipes.title,
        icon = Icons.Filled.List,
        route = Screen.Recipes.route
    ),
    NavItem(
        label = Screen.Favorite.title,
        icon = Icons.Filled.FavoriteBorder,
        route = Screen.Favorite.route
    )
)