package com.example.mylibrary.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.mylibrary.screens.WelcomeScreen

internal fun NavGraphBuilder.welcome(startDestinationRoute: String, navController: NavController) {
    composable(startDestinationRoute) {
        val navigateToLogin = { navController.navigate(loginRoute) }
        WelcomeScreen(navigateToLogin)
    }
}
