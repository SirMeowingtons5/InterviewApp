package com.sirmeowingtons5.interviewapp.domain.usecase

import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview
import com.sirmeowingtons5.interviewapp.domain.repository.InterviewRepository

class SaveInterviewUseCase(
    private val repository: InterviewRepository,
) {

    operator fun invoke(interview: Interview) {
        repository.save(interview)
    }
}