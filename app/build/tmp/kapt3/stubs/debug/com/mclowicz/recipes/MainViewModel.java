package com.mclowicz.recipes;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/mclowicz/recipes/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "recipeRepository", "Lcom/mclowicz/recipes/data/repository/RecipeRepository;", "(Lcom/mclowicz/recipes/data/repository/RecipeRepository;)V", "_viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/mclowicz/recipes/presentation/main/MainVieState;", "viewState", "getViewState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "fetchRecipeByCuisine", "", "cuisine", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.mclowicz.recipes.data.repository.RecipeRepository recipeRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.mclowicz.recipes.presentation.main.MainVieState> _viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.mclowicz.recipes.presentation.main.MainVieState> viewState = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.mclowicz.recipes.data.repository.RecipeRepository recipeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.mclowicz.recipes.presentation.main.MainVieState> getViewState() {
        return null;
    }
    
    public final void fetchRecipeByCuisine(@org.jetbrains.annotations.NotNull()
    java.lang.String cuisine) {
    }
}