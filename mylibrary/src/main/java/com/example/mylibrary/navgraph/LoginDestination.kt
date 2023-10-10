package com.example.mylibrary.navgraph

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.mylibrary.screens.LoginScreen
import com.example.mylibrary.screens.LoginViewModel
import com.example.mylibrary.screens.ViewState

internal const val loginRoute = "loginRoute"

internal fun NavGraphBuilder.login(navController: NavController, destinationWhenLoggedIn: String) {

    composable(loginRoute) { backStackEntry ->
        val loginViewModel: LoginViewModel = hiltViewModel()
        val uiState by loginViewModel.uiState.collectAsState()
        val userNameUpdated = { viewState: ViewState -> loginViewModel.loginName(viewState) }
        val login = {
            loginViewModel.loginClicked()
            navController.popBackStack(route = destinationWhenLoggedIn, inclusive = false)
        }
        LoginScreen(uiState = uiState, login = login, userNameUpdated = userNameUpdated)
    }
}
