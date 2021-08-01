package com.sirmeowingtons5.interviewapp.domain.entity.interview

import com.sirmeowingtons5.interviewapp.domain.entity.common.ID
import com.sirmeowingtons5.interviewapp.domain.entity.question.Question

data class Section(
    val id: ID,
    val title: String,
    val questions: List<Question>,
)