package com.sirmeowingtons5.interviewapp.domain.entity.question

import com.sirmeowingtons5.interviewapp.domain.entity.common.ID

@JvmInline
value class DifficultyModifier(val f: Float) {

    init {
        require(f > 0)
    }
}

data class Question(
    val id: ID,
    val title: String,
    val description: String,
    val difficultyModifier: DifficultyModifier,
)