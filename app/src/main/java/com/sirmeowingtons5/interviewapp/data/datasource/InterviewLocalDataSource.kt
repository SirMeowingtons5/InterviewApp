package com.sirmeowingtons5.interviewapp.data.datasource

import com.sirmeowingtons5.interviewapp.domain.entity.common.ID
import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview

class InterviewLocalDataSource : InterviewDataSource {

    private val interviews = HashMap<ID, Interview>()

    override fun getById(id: ID): Interview =
        requireNotNull(interviews[id])

    override fun save(interview: Interview) {
        interviews[interview.id] = interview
    }
}