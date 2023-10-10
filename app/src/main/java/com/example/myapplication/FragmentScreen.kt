package com.example.myapplication

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidViewBinding
import androidx.navigation.NavController
import com.example.myapplication.databinding.FragmentTestLayoutBinding

@Composable
fun FragmentViewScreen(navController: NavController) {
    AndroidViewBinding(modifier = Modifier.fillMaxSize(), factory = FragmentTestLayoutBinding::inflate) {
        val testFragment = testFragment.getFragment<TestFragment>()
    }
}
