package com.example.myapplication.navgraph

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.myapplication.ProfileScreen
import com.example.myapplication.ProfileViewModel

private const val routeName = "profile"
private const val profileIdArgs = "profileId"

internal fun NavGraphBuilder.profile(navController: NavHostController) {
    composable(
        route = "$routeName/{$profileIdArgs}",
        arguments = listOf(navArgument(name = profileIdArgs) { type = NavType.StringType })
    ) {backStackEntry ->
        val viewModel: ProfileViewModel = hiltViewModel()
        val viewState by viewModel.viewState.collectAsState()

        val navigateToOldAndroidView = { navController.navigate("oldAndroidView") }

        ProfileScreen(
            viewState = viewState,
            updateProfileId = viewModel::updateProfileID,
            navigateToOldAndroidView = navigateToOldAndroidView
        )
    }
}

internal fun NavController.navigateToProfile(profileArgs: ProfileArgs) {
    navigate(route = "$routeName/${profileArgs.profileId}")
}


internal class ProfileArgs(val profileId: String) {
    constructor(savedStateHandle: SavedStateHandle) : this(
        checkNotNull(savedStateHandle[profileIdArgs]) as String
    )
}
