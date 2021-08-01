package com.sirmeowingtons5.interviewapp.data.repository

import com.sirmeowingtons5.interviewapp.data.datasource.InterviewDataSource
import com.sirmeowingtons5.interviewapp.domain.entity.common.ID
import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview
import com.sirmeowingtons5.interviewapp.domain.repository.InterviewRepository

class InterviewRepositoryImpl(
    private val dataSource: InterviewDataSource,
) : InterviewRepository {

    override fun get(id: ID): Interview =
        dataSource.getById(id)

    override fun getAll(): List<Interview> =
        dataSource.getAll()

    override fun save(interview: Interview) {
        dataSource.save(interview)
    }
}