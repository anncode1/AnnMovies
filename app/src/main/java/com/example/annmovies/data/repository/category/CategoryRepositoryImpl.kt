package com.example.annmovies.data.repository.category

import com.example.annmovies.data.hardcoded.category.CategoryDataSet
import com.example.annmovies.domain.repository.category.CategoryRepository
import com.example.annmovies.utils.Result.Success

/**
 * Created by anahi.salgado on 23/03/2020
 */
class CategoryRepositoryImpl: CategoryRepository {
    override fun getCategories() = Success(CategoryDataSet.CATEGORIES)
}