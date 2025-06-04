package com.example.musify_app.ui.feature.login

sealed class LoginEvent {
    data class showErrorMessage(val message: String) : LoginEvent()
    object NavigateToRegister : LoginEvent()
    object NavigateToHome : LoginEvent()
}