package com.mclowicz.recipes.data.database

import androidx.room.*
import com.mclowicz.recipes.data.model.RecipeEntity
import com.mclowicz.recipes.data.model.RecipeResult

@Dao
interface RecipeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addRecipeToFavorites(recipeEntity: RecipeEntity)

    @Delete
    suspend fun removeFromFavorites(recipeEntity: RecipeEntity)

    @Query("select * FROM recipeentity")
    fun getFavoriteRecipes(): List<RecipeEntity>
}