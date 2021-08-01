package com.sirmeowingtons5.interviewapp.domain.entity.common

@JvmInline
value class ID(val value: String) {

    override fun toString(): String =
        value
}