package com.example.annmovies.domain.usecase.movie

import com.example.annmovies.domain.model.Movie
import com.example.annmovies.utils.Result

/**
 * Created by anahi.salgado on 23/05/2020
 */
interface GetMovies {
    fun invoke(): Result<List<Movie>>
}