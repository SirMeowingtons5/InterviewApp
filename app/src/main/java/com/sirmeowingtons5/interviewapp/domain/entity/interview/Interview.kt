package com.sirmeowingtons5.interviewapp.domain.entity.interview

import com.sirmeowingtons5.interviewapp.domain.entity.common.ID
import com.sirmeowingtons5.interviewapp.domain.entity.person.Person
import java.util.*

data class Interview(
    val id: ID,
    val date: Date,
    val title: String,
    val description: String,
    val blocks: List<Block>,
    val interviewee: Person,
    val state: InterviewState,
)
