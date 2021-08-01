package com.sirmeowingtons5.interviewapp.domain.entity.question

import com.sirmeowingtons5.interviewapp.domain.entity.common.ID

data class Answer(val id: ID, val questionId: ID, val answerScore: AnswerScore)
