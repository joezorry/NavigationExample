package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen(navigateToOldAndroidView: () -> Unit, viewState: String, updateProfileId: () -> Unit) {
    Column(modifier = Modifier.wrapContentSize()) {
        Text(text = "Profile", modifier = Modifier)

        Button(onClick = { navigateToOldAndroidView.invoke() }) {
            Text(text = "Navigate to Old Android View")
        }

        Text(modifier = Modifier.padding(top = 30.dp), text = viewState)

        Button(onClick = { updateProfileId() }) {
            Text(text = "Update Profile ID")
        }
    }
}
