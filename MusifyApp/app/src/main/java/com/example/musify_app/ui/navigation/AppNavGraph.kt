package com.example.musify_app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.musify_app.ui.feature.home.HomeScreen
import com.example.musify_app.ui.feature.login.LoginScreen
import com.example.musify_app.ui.feature.onboarding.OnboardingScreen
import com.example.musify_app.ui.feature.playsong.PlaySongScreen
import com.example.musify_app.ui.feature.register.RegisterScreen


@Composable
fun AppNavGraph(navController: NavHostController, startDestination: MusifyNavRoute) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable<OnboardingRoute> {
            OnboardingScreen(
                navController
            )
        }
        composable<LoginRoute> {
            LoginScreen(navController)
        }

        composable<RegisterRoute> {
            RegisterScreen(navController)
        }
        composable<HomeRoute> {
            HomeScreen(navController)
        }
        composable<PlaySongRoute> {
            val route = it.toRoute<PlaySongRoute>()
            PlaySongScreen(route.id, navController)
        }
    }
}