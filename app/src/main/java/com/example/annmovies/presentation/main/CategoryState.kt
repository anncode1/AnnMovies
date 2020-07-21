package com.example.annmovies.presentation.main

import com.example.annmovies.domain.model.Category

/**
 * Created by anahi.salgado on 9/05/2020
 */
sealed class CategoryState {
    abstract val categories: List<Category>
    data class Loading(override val categories: List<Category>): CategoryState()
    data class Categories(override val categories: List<Category>): CategoryState()
    data class Error(val message: String, override val categories: List<Category>): CategoryState()
}
