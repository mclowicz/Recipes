package com.mclowicz.recipes.data.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/mclowicz/recipes/data/exceptions/Exception;", "", "msg", "", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "ConnectionException", "EmptyException", "GeneralException", "ServerException", "UnauthorizedException", "Lcom/mclowicz/recipes/data/exceptions/Exception$UnauthorizedException;", "Lcom/mclowicz/recipes/data/exceptions/Exception$ServerException;", "Lcom/mclowicz/recipes/data/exceptions/Exception$GeneralException;", "Lcom/mclowicz/recipes/data/exceptions/Exception$EmptyException;", "Lcom/mclowicz/recipes/data/exceptions/Exception$ConnectionException;", "app_debug"})
public abstract class Exception extends java.lang.Throwable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String msg = null;
    
    private Exception(java.lang.String msg) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMsg() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mclowicz/recipes/data/exceptions/Exception$UnauthorizedException;", "Lcom/mclowicz/recipes/data/exceptions/Exception;", "msg", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class UnauthorizedException extends com.mclowicz.recipes.data.exceptions.Exception {
        
        public UnauthorizedException() {
            super(null);
        }
        
        public UnauthorizedException(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mclowicz/recipes/data/exceptions/Exception$ServerException;", "Lcom/mclowicz/recipes/data/exceptions/Exception;", "msg", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class ServerException extends com.mclowicz.recipes.data.exceptions.Exception {
        
        public ServerException() {
            super(null);
        }
        
        public ServerException(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mclowicz/recipes/data/exceptions/Exception$GeneralException;", "Lcom/mclowicz/recipes/data/exceptions/Exception;", "msg", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class GeneralException extends com.mclowicz.recipes.data.exceptions.Exception {
        
        public GeneralException() {
            super(null);
        }
        
        public GeneralException(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mclowicz/recipes/data/exceptions/Exception$EmptyException;", "Lcom/mclowicz/recipes/data/exceptions/Exception;", "msg", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class EmptyException extends com.mclowicz.recipes.data.exceptions.Exception {
        
        public EmptyException() {
            super(null);
        }
        
        public EmptyException(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mclowicz/recipes/data/exceptions/Exception$ConnectionException;", "Lcom/mclowicz/recipes/data/exceptions/Exception;", "msg", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class ConnectionException extends com.mclowicz.recipes.data.exceptions.Exception {
        
        public ConnectionException() {
            super(null);
        }
        
        public ConnectionException(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            super(null);
        }
    }
}