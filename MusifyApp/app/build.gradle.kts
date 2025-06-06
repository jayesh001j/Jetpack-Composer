plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kotlin.ksp)
    alias(libs.plugins.kotlin.serialization)
    id("kotlin-parcelize")
}

    android {
        namespace = "com.example.musify_app"
        compileSdk = 35

        defaultConfig {
            applicationId = "com.example.musify_app"
            minSdk = 26
            targetSdk = 35
            versionCode = 1
            versionName = "1.0"

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }

        buildTypes {
            release {
                isMinifyEnabled = false
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
        }
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_11
            targetCompatibility = JavaVersion.VERSION_11
        }
        kotlinOptions {
            jvmTarget = "11"
        }
        buildFeatures {
            compose = true
        }
    }

    dependencies {

        implementation(libs.androidx.core.ktx)
        implementation(libs.androidx.lifecycle.runtime.ktx)
        implementation(libs.androidx.activity.compose)
        implementation(platform(libs.androidx.compose.bom))
        implementation(libs.androidx.ui)
        implementation(libs.androidx.ui.graphics)
        implementation(libs.androidx.ui.tooling.preview)
        implementation(libs.androidx.material3)
        testImplementation(libs.junit)
        androidTestImplementation(libs.androidx.junit)
        androidTestImplementation(libs.androidx.espresso.core)
        androidTestImplementation(platform(libs.androidx.compose.bom))
        androidTestImplementation(libs.androidx.ui.test.junit4)
        debugImplementation(libs.androidx.ui.tooling)
        debugImplementation(libs.androidx.ui.test.manifest)
        implementation(libs.androidx.core.splashscreen)
        implementation(libs.koin.android)
        implementation(libs.koin.annotations)
        ksp(libs.koin.ksp.compiler)

        implementation(libs.koin.androidx.navigation)
        implementation(libs.koin.androidx.compose)

        implementation(libs.retrofit)
        implementation(libs.converter.gson)
        implementation(libs.logging.interceptor)
        implementation(libs.androidx.navigation.compose)
        implementation(libs.kotlinx.serialization.json)
        implementation(libs.coil.compose)
        implementation(libs.coil.network.okhttp)

        implementation("androidx.media3:media3-exoplayer:1.7.1")
        implementation("androidx.media3:media3-session:1.7.1")
        implementation("androidx.media3:media3-ui:1.7.1")
        implementation("androidx.media:media:1.7.0")

    }

