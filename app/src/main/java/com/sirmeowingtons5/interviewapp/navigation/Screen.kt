package com.sirmeowingtons5.interviewapp.navigation

sealed class Screen (val route: String) {

    private companion object {
        const val INTERVIEW_LIST_ROUTE = "interview_list"
    }

    object InterviewList : Screen(INTERVIEW_LIST_ROUTE)
}