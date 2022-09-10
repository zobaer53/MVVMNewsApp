package com.zobaer53.mvvmnewsapp.models


data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)