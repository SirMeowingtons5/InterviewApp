package com.sirmeowingtons5.interviewapp.domain.usecase

import com.sirmeowingtons5.interviewapp.domain.entity.common.ID
import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview
import com.sirmeowingtons5.interviewapp.domain.repository.InterviewRepository
import javax.inject.Inject

class GetInterviewUseCase @Inject constructor(
    private val repository: InterviewRepository,
) {

    operator fun invoke(id: ID): Interview =
        repository.get(id)
}