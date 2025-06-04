package com.example.musify_app.ui.feature.home

import com.example.musify_app.data.model.HomeDataResponse

sealed class HomeState {
    object Loading : HomeState()
    data class Success(val data: HomeDataResponse) : HomeState()
    data class Error(val message: String) : HomeState()
}