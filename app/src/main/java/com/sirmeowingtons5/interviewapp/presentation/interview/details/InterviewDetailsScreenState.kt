package com.sirmeowingtons5.interviewapp.presentation.interview.details

import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview

sealed class InterviewDetailsScreenState {

    object Loading : InterviewDetailsScreenState()

    data class Error(val exception: Exception) : InterviewDetailsScreenState()

    data class Success(val data: Interview) : InterviewDetailsScreenState()
}