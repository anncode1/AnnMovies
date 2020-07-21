package com.example.annmovies.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.annmovies.R
import com.example.annmovies.data.repository.category.CategoryRepositoryImpl
import com.example.annmovies.domain.model.Category
import com.example.annmovies.domain.usecase.category.GetCategoryImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val categoryRepositoryImpl = CategoryRepositoryImpl()
        val getCategoryImpl = GetCategoryImpl(categoryRepositoryImpl)
        val factory = MainViewModel.Factory(getCategoryImpl)
        mainViewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]
        mainViewModel.getCategoryStates().observe(this, Observer {
            when (it) {
                is CategoryState.Loading -> tv_categories.setText(R.string.loading)
                is CategoryState.Categories -> setCategories(it.categories)
                is CategoryState.Error -> tv_categories.text = it.message
            }
        })
    }

    private fun setCategories(categories: List<Category>) {
        tv_categories.text = ""
        categories.forEach {
            val category = it
            tv_categories.append(category.name + "\n")
        }
    }
}
