package com.sirmeowingtons5.interviewapp.ui.screen.shared.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ErrorComponent(cause: String) {
    Text(text = "Error caused by: $cause")
}