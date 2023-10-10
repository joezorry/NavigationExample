package com.example.myapplication.navgraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.myapplication.OldAndroidViewScreen

private const val routeName = "oldAndroidView"

internal fun NavGraphBuilder.oldAndroidView() {
    composable(routeName) { OldAndroidViewScreen() }
}
