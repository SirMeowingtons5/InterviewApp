package com.sirmeowingtons5.interviewapp.domain.usecase

import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview
import com.sirmeowingtons5.interviewapp.domain.repository.InterviewRepository
import javax.inject.Inject

class GetAllInterviewsUseCase @Inject constructor(
    private val repository: InterviewRepository,
) {

    operator fun invoke(): List<Interview> =
        repository.getAll()
}