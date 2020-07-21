package com.example.annmovies.domain.usecase.category

import com.example.annmovies.domain.repository.category.CategoryRepository

/**
 * Created by anahi.salgado on 15/03/2020
 */
class GetCategoryImpl(private val categoryRepository: CategoryRepository): GetCategory {
    override fun invoke() = categoryRepository.getCategories()
}