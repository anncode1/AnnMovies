package com.example.annmovies.data.hardcoded.category

import com.example.annmovies.domain.model.Category

/**
 * Created by anahi.salgado on 16/03/2020
 */
class CategoryDataSet {
    companion object {
        val CATEGORIES = buildCategories()
        private fun buildCategories(): List<Category> {
            return listOf(
                Category(1, "Popular"),
                Category(2, "Top Rated"),
                Category(3, "Upcoming")
            )
        }
    }
}