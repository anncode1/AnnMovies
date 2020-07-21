package com.example.annmovies.presentation.main

import com.example.annmovies.presentation.main.CategoryState.Categories
import com.example.annmovies.presentation.main.CategoryState.Loading
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.annmovies.domain.usecase.category.GetCategory
import com.example.annmovies.utils.Result

/**
 * Created by anahi.salgado on 9/05/2020
 */
class MainViewModel(private val categoryUseCase: GetCategory) : ViewModel() {

    private val categoryState = MutableLiveData<CategoryState>()

    init {
        categoryState.postValue(Categories(listOf()))
    }

    fun getCategoryStates(): MutableLiveData<CategoryState> {
        getCategories()
        return categoryState
    }

    private fun getCategories() {
        categoryState.value = Loading(listOf())
        val result = categoryUseCase.invoke()
        when (result) {
            is Result.Success -> categoryState.postValue(Categories(result.value))
            is Result.Error -> categoryState.postValue(CategoryState.Error(result.error.message.toString(), listOf()))
        }
    }

    class Factory(private val categoryUseCases: GetCategory): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>) = MainViewModel(categoryUseCases) as T
    }
}
