package com.sirmeowingtons5.interviewapp.domain.repository

import com.sirmeowingtons5.interviewapp.domain.entity.common.ID
import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview

interface InterviewRepository {

    fun get(id: ID): Interview

    fun save(interview: Interview)
}