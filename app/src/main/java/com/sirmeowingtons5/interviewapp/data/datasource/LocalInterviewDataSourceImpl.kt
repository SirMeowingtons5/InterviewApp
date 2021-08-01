package com.sirmeowingtons5.interviewapp.data.datasource

import com.sirmeowingtons5.interviewapp.domain.entity.common.ID
import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview
import com.sirmeowingtons5.interviewapp.domain.entity.interview.InterviewState
import com.sirmeowingtons5.interviewapp.domain.entity.person.FirstName
import com.sirmeowingtons5.interviewapp.domain.entity.person.LastName
import com.sirmeowingtons5.interviewapp.domain.entity.person.Person
import java.util.*
import javax.inject.Inject
import kotlin.collections.HashMap

class LocalInterviewDataSourceImpl @Inject constructor() : InterviewDataSource {

    private val interviews = HashMap<String, Interview>()

    init {
        generatePredefinedData().forEach { save(it) }
    }


    override fun getById(id: ID): Interview =
        requireNotNull(interviews[id.value])

    override fun getAll(): List<Interview> =
        interviews.values.toList()

    override fun save(interview: Interview) {
        interviews[interview.id.value] = interview
    }

    private fun generatePredefinedData(): List<Interview> =
        listOf(
            Interview(
                id = ID("Interview1"),
                date = Date(1),
                title = "First interview",
                description = "Very long first interview description",
                blocks = emptyList(),
                interviewee = Person(
                    id = ID("Person1"),
                    firstName = FirstName("John"),
                    lastName = LastName("Doe")
                ),
                state = InterviewState.FINISHED
            ),
            Interview(
                id = ID("Interview2"),
                date = Date(2),
                title = "Second interview",
                description = "Medium long second interview description",
                blocks = emptyList(),
                interviewee = Person(
                    id = ID("Person2"),
                    firstName = FirstName("Jane"),
                    lastName = LastName("Doe")
                ),
                state = InterviewState.IN_PROCESS
            ),
            Interview(
                id = ID("Interview3"),
                date = Date(3),
                title = "Third interview",
                description = "Short third interview description",
                blocks = emptyList(),
                interviewee = Person(
                    id = ID("Person1"),
                    firstName = FirstName("Jake"),
                    lastName = LastName("Doe")
                ),
                state = InterviewState.NOT_STARTED
            ),
        )
}