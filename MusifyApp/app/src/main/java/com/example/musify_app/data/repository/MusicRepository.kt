package com.example.musify_app.data.repository


import com.example.musify_app.data.model.Song
import com.example.musify_app.data.network.ApiService
import com.example.musify_app.data.network.Resource
import org.koin.core.annotation.Single

@Single
class MusicRepository(private val apiService: ApiService) {
    suspend fun getSongById(id: String): Resource<Song> {
        return try {
            val response = apiService.getSongById(id)
            if (response.isSuccessful) {
                Resource.Success(response.body()!!)
            } else {
                Resource.Error("Failed to fetch song data")
            }
        } catch (e: Exception) {
            Resource.Error("Network error: ${e.message}")
        }
    }

}