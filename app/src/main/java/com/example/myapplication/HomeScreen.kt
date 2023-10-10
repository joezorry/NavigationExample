package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myapplication.navgraph.ProfileArgs

@Composable
internal fun HomeScreen(navigateToProfile: (ProfileArgs) -> Unit, navigateToFragment: () -> Unit) {
    val profileId = "Joakim"

    Column(modifier = Modifier.wrapContentSize()) {
        Text(
            text = "Hello $profileId!",
        )
        Button(
            modifier = Modifier.wrapContentHeight(),
            onClick = { navigateToProfile(ProfileArgs(profileId = profileId)) }) {
            Text(text = "Navigate to Compose Screen")
        }

        Button(onClick = { navigateToFragment() }) {
            Text(text = "Navigate to Fragment")
        }
    }
}
