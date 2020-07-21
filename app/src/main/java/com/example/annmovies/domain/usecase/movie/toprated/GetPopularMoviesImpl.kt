package com.example.annmovies.domain.usecase.movie.toprated

import com.example.annmovies.domain.model.Movie
import com.example.annmovies.domain.repository.movie.MovieRepository
import com.example.annmovies.domain.usecase.movie.GetMovies
import com.example.annmovies.utils.Result

/**
 * Created by anahi.salgado on 15/03/2020
 */
class GetPopularMoviesImpl(private val movieRepository: MovieRepository): GetMovies {
    override fun invoke(): Result<List<Movie>> {
        TODO("Not yet implemented")
    }
}
