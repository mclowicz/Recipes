package com.mclowicz.recipes.presentation.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/mclowicz/recipes/presentation/main/MainVieState;", "", "()V", "Error", "Idle", "Loading", "Success", "Lcom/mclowicz/recipes/presentation/main/MainVieState$Idle;", "Lcom/mclowicz/recipes/presentation/main/MainVieState$Loading;", "Lcom/mclowicz/recipes/presentation/main/MainVieState$Error;", "Lcom/mclowicz/recipes/presentation/main/MainVieState$Success;", "app_debug"})
public abstract class MainVieState {
    
    private MainVieState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mclowicz/recipes/presentation/main/MainVieState$Idle;", "Lcom/mclowicz/recipes/presentation/main/MainVieState;", "()V", "app_debug"})
    public static final class Idle extends com.mclowicz.recipes.presentation.main.MainVieState {
        @org.jetbrains.annotations.NotNull()
        public static final com.mclowicz.recipes.presentation.main.MainVieState.Idle INSTANCE = null;
        
        private Idle() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mclowicz/recipes/presentation/main/MainVieState$Loading;", "Lcom/mclowicz/recipes/presentation/main/MainVieState;", "()V", "app_debug"})
    public static final class Loading extends com.mclowicz.recipes.presentation.main.MainVieState {
        @org.jetbrains.annotations.NotNull()
        public static final com.mclowicz.recipes.presentation.main.MainVieState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/mclowicz/recipes/presentation/main/MainVieState$Error;", "Lcom/mclowicz/recipes/presentation/main/MainVieState;", "exception", "Lcom/mclowicz/recipes/data/exceptions/Exception;", "(Lcom/mclowicz/recipes/data/exceptions/Exception;)V", "getException", "()Lcom/mclowicz/recipes/data/exceptions/Exception;", "app_debug"})
    public static final class Error extends com.mclowicz.recipes.presentation.main.MainVieState {
        @org.jetbrains.annotations.NotNull()
        private final com.mclowicz.recipes.data.exceptions.Exception exception = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        com.mclowicz.recipes.data.exceptions.Exception exception) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mclowicz.recipes.data.exceptions.Exception getException() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/mclowicz/recipes/presentation/main/MainVieState$Success;", "Lcom/mclowicz/recipes/presentation/main/MainVieState;", "data", "", "Lcom/mclowicz/recipes/data/model/RecipeResult;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "app_debug"})
    public static final class Success extends com.mclowicz.recipes.presentation.main.MainVieState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.mclowicz.recipes.data.model.RecipeResult> data = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        java.util.List<com.mclowicz.recipes.data.model.RecipeResult> data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.mclowicz.recipes.data.model.RecipeResult> getData() {
            return null;
        }
    }
}