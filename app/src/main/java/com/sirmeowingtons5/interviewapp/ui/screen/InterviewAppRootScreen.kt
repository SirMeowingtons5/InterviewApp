package com.sirmeowingtons5.interviewapp.ui.screen

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.sirmeowingtons5.interviewapp.ui.screen.interview.list.InterviewListScreen
import com.sirmeowingtons5.interviewapp.ui.theme.InterviewAppTheme

@Composable
fun InterviewAppRootScreen() {
    InterviewAppTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            InterviewListScreen()
        }
    }
}