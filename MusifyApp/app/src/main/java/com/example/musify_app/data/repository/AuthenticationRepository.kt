package com.example.musify_app.data.repository


import com.example.musify_app.data.model.LoginRequest
import com.example.musify_app.data.model.LoginResponse
import com.example.musify_app.data.model.RegisterRequest
import com.example.musify_app.data.network.ApiService
import com.example.musify_app.data.network.Resource
import org.koin.core.annotation.Single

@Single
class AuthenticationRepository(
    private val apiService: ApiService
) {

    suspend fun login(loginRequest: LoginRequest): Resource<LoginResponse> {
        return try {
            val response = apiService.login(loginRequest)
            if (response.isSuccessful) {
                Resource.Success(response.body()!!)
            } else {
                Resource.Error("Login failed")
            }
        } catch (e: Exception) {
            Resource.Error("Network error: ${e.message}")
        }
    }

    suspend fun register(registerRequest: RegisterRequest): Resource<LoginResponse> {
        return try {
            val response = apiService.register(registerRequest)
            if (response.isSuccessful) {
                Resource.Success(response.body()!!)
            } else {
                Resource.Error("Registration failed")
            }
        } catch (e: Exception) {
            Resource.Error("Network error: ${e.message}")
        }
    }
}