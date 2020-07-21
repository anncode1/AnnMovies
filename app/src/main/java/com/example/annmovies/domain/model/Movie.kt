package com.example.annmovies.domain.model

/**
 * Created by anahi.salgado on 15/03/2020
 */
data class Movie (
    private val id: Long,
    private val originalTitle: String,
    private val overview: String,
    private val popularity: Float,
    private val releaseDate: String,
    private val status: String,
    private val tagline: String,
    private val title: String,
    private val video: Boolean,
    private val voteAverage: Double,
    private val voteCount: Int
)