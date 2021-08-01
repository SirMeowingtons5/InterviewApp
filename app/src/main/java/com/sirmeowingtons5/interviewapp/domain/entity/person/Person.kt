package com.sirmeowingtons5.interviewapp.domain.entity.person

import com.sirmeowingtons5.interviewapp.domain.entity.common.ID

@JvmInline
value class FirstName(val value: String) {

    init {
        require(value.isNotBlank())
    }

    override fun toString(): String =
        value
}

@JvmInline
value class LastName(val value: String) {

    init {
        require(value.isNotBlank())
    }

    override fun toString(): String =
        value
}

data class Person(val id: ID, val firstName: FirstName, val lastName: LastName)