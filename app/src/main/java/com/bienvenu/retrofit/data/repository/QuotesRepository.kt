package com.bienvenu.retrofit.data.repository

import com.bienvenu.retrofit.data.datasource.QuotesApi
import com.bienvenu.retrofit.util.Resource
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class QuotesRepository @Inject constructor(
    private val api: QuotesApi
) {

    suspend fun getNotes() = flow{
        emit(Resource.Loading())
        val quotes = api.getQuotes().body()?.quotes
        emit(Resource.Success(quotes))
    }.catch {error->
        emit(Resource.Error(error.message!!))
    }

}
