package com.example.mylibrary.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeScreen(navigateToLogin: () -> Unit) {
    Column {

        Text(modifier = Modifier.padding(bottom = 16.dp), text = "Welcome")

        Button(onClick = { navigateToLogin() }) {
            Text(text = "Login")
        }
    }

}
