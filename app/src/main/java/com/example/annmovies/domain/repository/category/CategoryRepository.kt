package com.example.annmovies.domain.repository.category

import com.example.annmovies.domain.model.Category
import com.example.annmovies.utils.Result

/**
 * Created by anahi.salgado on 23/03/2020
 */
interface CategoryRepository {
    fun getCategories(): Result<List<Category>>
}