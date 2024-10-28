package com.bienvenu.retrofit.ui

import com.bienvenu.retrofit.domain.model.Quote

data class UiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val quotes: List<Quote>? = emptyList()
)
