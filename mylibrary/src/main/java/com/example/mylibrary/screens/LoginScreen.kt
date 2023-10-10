package com.example.mylibrary.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State

@Composable
fun LoginScreen(uiState: ViewState, userNameUpdated: (ViewState) -> Unit, login: () -> Boolean) {

    Column {
        TextField(onValueChange = { newText -> userNameUpdated(ViewState(newText)) }, value = uiState.profileName)

        Button(onClick = { login() }) {
            Text(text = "Login")
        }

    }
}
