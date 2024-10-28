package com.bienvenu.retrofit.domain.model

data class QuotesResponse(
    val quotes : List<Quote>,
    val total : Int
)
