package com.example.myapplication.navgraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.myapplication.FragmentViewScreen

private const val routeName = "fragment"

internal fun NavGraphBuilder.fragment() {
    composable(routeName) { FragmentViewScreen() }
}
