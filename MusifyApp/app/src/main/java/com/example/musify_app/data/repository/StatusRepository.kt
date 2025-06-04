package com.example.musify_app.data.repository

import com.example.musify_app.data.network.ApiService
import org.koin.core.annotation.Single

@Single
class StatusRepository(
    private val apiService: ApiService
) {
    suspend fun getStatus(): String {
        return apiService.getSomething().body()?.get("status") ?: "Failed"
    }
}