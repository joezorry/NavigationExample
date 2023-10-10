package com.example.mylibrary.screens

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

data class ViewState(val profileName: String, val isLoggedIn: Boolean = false)

@HiltViewModel
class LoginViewModel @Inject constructor(private val profileRepository: ProfileRepository) : ViewModel() {

    private val _uiState = MutableStateFlow(ViewState(""))
    val uiState: StateFlow<ViewState> = _uiState

    init {
        viewModelScope.launch {
            profileRepository.loginDataHolderFlow.collect {
                val isLoggedIn = it.profileName != ""
                _uiState.value = uiState.value.copy(isLoggedIn = isLoggedIn)
            }
        }
    }

    fun loginName(loginNameInput: ViewState) {
        _uiState.value = loginNameInput
    }

    fun loginClicked() {
        profileRepository.sendLoginUser(LoginDataHolder(uiState.value.profileName))
    }
}
