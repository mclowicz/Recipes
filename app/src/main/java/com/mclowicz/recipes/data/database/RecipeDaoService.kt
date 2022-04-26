package com.mclowicz.recipes.data.database

import com.mclowicz.recipes.data.model.RecipeEntity
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RecipeDaoService @Inject constructor(
    private val recipeDao: RecipeDao
) {

    suspend fun addToFavorites(recipe: RecipeEntity) = recipeDao
        .addRecipeToFavorites(recipeEntity = recipe)

    suspend fun removeFromFavorite(recipe: RecipeEntity) = recipeDao
        .removeFromFavorites(recipeEntity = recipe)

    fun getFavoriteRecipes() = flow {
        emit(recipeDao.getFavoriteRecipes())
    }
}