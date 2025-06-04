package com.example.musify_app.data.model

import com.google.gson.annotations.SerializedName


data class LoginResponse(

    @SerializedName("token") var token: String? = null,
    @SerializedName("user") var user: User? = User()

)