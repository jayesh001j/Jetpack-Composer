package com.example.musify_app

import android.app.Application
import com.example.musify_app.di.NetworkModule
import com.example.musify_app.helper.MusifyNotificationHelper
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.ksp.generated.defaultModule
import org.koin.ksp.generated.module

class MusifyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MusifyApp)
            modules(defaultModule, NetworkModule().module)
        }
        MusifyNotificationHelper.createNotificationChannel(this)
    }
}