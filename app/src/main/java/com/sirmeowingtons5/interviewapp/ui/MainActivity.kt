package com.sirmeowingtons5.interviewapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.sirmeowingtons5.interviewapp.ui.screen.interview.list.InterviewListRootScreen
import com.sirmeowingtons5.interviewapp.ui.theme.InterviewAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InterviewAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    InterviewListRootScreen()
                }
            }
        }
    }
}