package com.example.myapplication

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.viewinterop.AndroidViewBinding
import com.example.myapplication.databinding.OldViewBinding

@SuppressLint("SetTextI18n")
@Composable
fun OldAndroidViewScreen() {
    var selectedItem by remember { mutableIntStateOf(0) }
    var text by remember { mutableStateOf("Default") }

    AndroidViewBinding(factory = { context, viewGroup, attachToParent ->
        OldViewBinding.inflate(context, viewGroup, attachToParent).apply {
            textInfo.text = "This text is changed in Code, during creation"
            button.setOnClickListener {
                selectedItem += 1
                text = "CLICKED"
            }
        }
    }, update = {
        val toString = selectedItem.toString()
        counter.text = toString
        changeThis.text = text
    })
}
