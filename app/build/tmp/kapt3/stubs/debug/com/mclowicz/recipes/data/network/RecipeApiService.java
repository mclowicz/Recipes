package com.mclowicz.recipes.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/mclowicz/recipes/data/network/RecipeApiService;", "", "recipeApi", "Lcom/mclowicz/recipes/data/network/RecipeApi;", "(Lcom/mclowicz/recipes/data/network/RecipeApi;)V", "fetchRecipeByCuisine", "Lkotlinx/coroutines/flow/Flow;", "Lcom/mclowicz/recipes/data/model/RecipeResults;", "cuisine", "", "app_debug"})
public final class RecipeApiService {
    private final com.mclowicz.recipes.data.network.RecipeApi recipeApi = null;
    
    @javax.inject.Inject()
    public RecipeApiService(@org.jetbrains.annotations.NotNull()
    com.mclowicz.recipes.data.network.RecipeApi recipeApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.mclowicz.recipes.data.model.RecipeResults> fetchRecipeByCuisine(@org.jetbrains.annotations.NotNull()
    java.lang.String cuisine) {
        return null;
    }
}