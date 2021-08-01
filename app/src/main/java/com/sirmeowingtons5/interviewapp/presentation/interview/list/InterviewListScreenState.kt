package com.sirmeowingtons5.interviewapp.presentation.interview.list

import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview

sealed class InterviewListScreenState {

    object Loading : InterviewListScreenState()

    data class Error(val exception: Exception) : InterviewListScreenState()

    data class Success(val data: List<Interview>) : InterviewListScreenState()
}