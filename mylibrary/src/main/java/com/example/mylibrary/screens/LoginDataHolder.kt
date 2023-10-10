package com.example.mylibrary.screens

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Singleton

data class LoginDataHolder(val profileName: String)

@Singleton
class ProfileRepository() {

    private var loginDataHolder = LoginDataHolder("")

    private val _loginDataHolderFlow = MutableSharedFlow<LoginDataHolder>(replay = 0)
    val loginDataHolderFlow: SharedFlow<LoginDataHolder> = _loginDataHolderFlow

    fun sendLoginUser(loginDataHolder: LoginDataHolder) {
        Log.e("TAF", "Click ${loginDataHolder.profileName}")
        GlobalScope.launch {
            _loginDataHolderFlow.emit(loginDataHolder)
        }
    }
}
