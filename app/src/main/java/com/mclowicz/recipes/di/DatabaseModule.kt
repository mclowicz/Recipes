package com.mclowicz.recipes.di

import android.content.Context
import androidx.room.Room
import com.mclowicz.recipes.data.database.AppDatabase
import com.mclowicz.recipes.data.database.RecipeDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun providesRecipeDAO(
        @ApplicationContext context: Context
    ): RecipeDao {
        val db = Room.databaseBuilder(
            context, AppDatabase::class.java,
            "recipe-database"
        )
            .fallbackToDestructiveMigration()
            .build()
        return db.recipeDao()
    }
}