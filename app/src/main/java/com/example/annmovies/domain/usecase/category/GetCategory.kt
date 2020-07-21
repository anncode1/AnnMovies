package com.example.annmovies.domain.usecase.category

import com.example.annmovies.domain.model.Category
import com.example.annmovies.utils.Result

/**
 * Created by anahi.salgado on 15/03/2020
 */
interface GetCategory {
    fun invoke(): Result<List<Category>>
}