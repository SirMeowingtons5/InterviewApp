package com.sirmeowingtons5.interviewapp.domain.entity.interview

import com.sirmeowingtons5.interviewapp.domain.entity.common.ID

data class Block(
    val id: ID,
    val title: String,
    val sections: List<Section>,
)
