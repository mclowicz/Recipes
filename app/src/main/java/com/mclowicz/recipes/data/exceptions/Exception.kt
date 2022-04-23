package com.mclowicz.recipes.data.exceptions

import android.util.Log
import retrofit2.HttpException
import java.net.ConnectException

sealed class Exception(val msg: String): Throwable() {
    class UnauthorizedException(msg: String = "Unauthorized!"): Exception(msg)
    class ServerException(msg: String = "Server error. Please try again!"): Exception(msg)
    class GeneralException(msg: String = "Please try again!"): Exception(msg)
    class EmptyException(msg: String = "No results."): Exception(msg)
    class ConnectionException(msg: String = "No internet connection"): Exception(msg)
}

fun HttpException.toViewException(): Exception {
    return if (this.code() == 401) {
        Exception.UnauthorizedException()
    } else if (this.code() == 500) {
        Exception.ServerException()
    } else {
        Exception.GeneralException()
    }
}

fun Throwable.handleException(): Exception {
    return when(this) {
        is HttpException -> this.toViewException()
        is ConnectException -> this.toViewException()
        else -> Exception.GeneralException()
    }
}

fun ConnectException.toViewException(): Exception {
    return Exception.ConnectionException()
}