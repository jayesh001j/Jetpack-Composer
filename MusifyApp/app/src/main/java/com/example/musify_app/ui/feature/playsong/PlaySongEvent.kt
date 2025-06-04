package com.example.musify_app.ui.feature.playsong

sealed class PlaySongEvent {
    data class showErrorMessage(val message: String) : PlaySongEvent()
}