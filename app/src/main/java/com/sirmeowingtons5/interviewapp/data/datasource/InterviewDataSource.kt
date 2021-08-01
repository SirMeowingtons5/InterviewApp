package com.sirmeowingtons5.interviewapp.data.datasource

import com.sirmeowingtons5.interviewapp.domain.entity.common.ID
import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview

interface InterviewDataSource {

    fun getById(id: ID): Interview

    fun getAll(): List<Interview>

    fun save(interview: Interview)
}