package com.example.myapplication

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.navgraph.ProfileArgs
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(savedStateHandle: SavedStateHandle): ViewModel() {

    private val profileArgs = ProfileArgs(savedStateHandle = savedStateHandle)

    private val _viewState = MutableStateFlow(value = profileArgs.profileId)
    val viewState: StateFlow<String> = _viewState

    fun updateProfileID() {
        _viewState.value = ("New Profile ID")
    }
}
