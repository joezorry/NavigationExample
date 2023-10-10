package com.example.mylibrary.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation

const val loginGraphRoute = "loginGraph"
private const val startDestinationRoute = "welcome"

fun NavGraphBuilder.loginGraph(navController: NavController, destinationWhenLoggedIn: String) {
    navigation(startDestination = startDestinationRoute, route = loginGraphRoute) {
        welcome(startDestinationRoute, navController)
        login(navController, destinationWhenLoggedIn)
    }
}
