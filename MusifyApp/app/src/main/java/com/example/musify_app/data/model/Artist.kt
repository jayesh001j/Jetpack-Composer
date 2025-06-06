package com.example.musify_app.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Artist(
    val bio: String,
    val createdAt: Long,
    val id: String,
    val name: String,
    val profilePicture: String,
    val updatedAt: Long
) : Parcelable