package com.example.myapplication.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.myapplication.HomeScreen

internal fun NavGraphBuilder.home(startDestinationRoute: String, navController: NavController) {
    val navigateToProfile = { profileIdArgs: ProfileArgs -> navController.navigateToProfile(profileIdArgs) }
    val navigateToFragment = { navController.navigate("fragment") }

    composable(startDestinationRoute) { HomeScreen(navigateToProfile, navigateToFragment) }
}
