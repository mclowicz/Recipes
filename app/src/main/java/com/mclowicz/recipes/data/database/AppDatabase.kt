package com.mclowicz.recipes.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mclowicz.recipes.data.model.RecipeEntity

@Database(entities = [RecipeEntity::class], version = 3)
abstract class AppDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
}