package com.sirmeowingtons5.interviewapp.domain.entity.person

import com.sirmeowingtons5.interviewapp.domain.entity.common.ID

@JvmInline
value class FirstName(val s: String) {

    init {
        require(s.isNotBlank())
    }
}

@JvmInline
value class LastName(val s: String) {

    init {
        require(s.isNotBlank())
    }
}

data class Person(val id: ID, val firstName: FirstName, val lastName: LastName)