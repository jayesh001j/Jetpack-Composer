package com.example.musify_app.ui.feature.register

sealed class RegisterState {
    object Loading : RegisterState()
    object Success : RegisterState()
    data class Error(val message: String) : RegisterState()
    object Nothing : RegisterState()
}