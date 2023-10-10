package com.example.myapplication.navgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.mylibrary.navgraph.loginGraph
import com.example.mylibrary.navgraph.loginGraphRoute
import kotlin.math.log

const val startDestinationRoute = "home"

@Composable
fun NavGraphApp(navController: NavHostController, loggedIn: Boolean) {

    NavHost(navController = navController, startDestination = startDestinationRoute) {
        // Main Destinations
        home(startDestinationRoute, navController)
        profile(navController)
        oldAndroidView()
        fragment()

        // Graphs
        loginGraph(navController = navController, destinationWhenLoggedIn = startDestinationRoute)
    }

    if (!loggedIn) navController.navigate(loginGraphRoute)
}
