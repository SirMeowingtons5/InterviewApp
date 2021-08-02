package com.sirmeowingtons5.interviewapp.ui.screen

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sirmeowingtons5.interviewapp.navigation.Screen
import com.sirmeowingtons5.interviewapp.ui.screen.interview.list.InterviewListScreen
import com.sirmeowingtons5.interviewapp.ui.theme.InterviewAppTheme

@Composable
fun InterviewAppRootScreen() {
    val navController = rememberNavController()
    InterviewAppTheme {
        Surface(color = MaterialTheme.colors.background) {
            NavHost(navController = navController, startDestination = Screen.InterviewList.route) {
                composable(Screen.InterviewList.route) { InterviewListScreen() }
            }
        }
    }
}