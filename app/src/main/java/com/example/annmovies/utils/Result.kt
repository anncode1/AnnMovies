package com.example.annmovies.utils

/**
 * Created by anahi.salgado on 23/05/2020
 */
sealed class Result<T> {
    data class Success<T>(val value: T): Result<T>()
    data class Error<T>(val error: Throwable): Result<T>()
}