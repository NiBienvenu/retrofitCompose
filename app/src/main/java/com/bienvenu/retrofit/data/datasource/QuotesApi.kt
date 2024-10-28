package com.bienvenu.retrofit.data.datasource

import com.bienvenu.retrofit.domain.model.QuotesResponse
import retrofit2.Response
import retrofit2.http.GET

interface QuotesApi {
    @GET("/quotes")
    suspend fun getQuotes() : Response<QuotesResponse>
}