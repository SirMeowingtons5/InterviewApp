package com.sirmeowingtons5.interviewapp.domain.usecase

import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview
import com.sirmeowingtons5.interviewapp.domain.repository.InterviewRepository

class GetAllInterviewsUseCase(
    private val repository: InterviewRepository,
) {

    operator fun invoke(): List<Interview> =
        repository.getAll()
}