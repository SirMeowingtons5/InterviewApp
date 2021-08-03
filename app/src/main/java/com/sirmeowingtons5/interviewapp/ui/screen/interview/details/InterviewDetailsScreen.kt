package com.sirmeowingtons5.interviewapp.ui.screen.interview.details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.sirmeowingtons5.interviewapp.domain.entity.common.ID
import com.sirmeowingtons5.interviewapp.domain.entity.interview.Block
import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview
import com.sirmeowingtons5.interviewapp.domain.entity.person.Person
import com.sirmeowingtons5.interviewapp.presentation.interview.details.InterviewDetailsViewModel
import com.sirmeowingtons5.interviewapp.ui.screen.shared.component.ErrorComponent
import com.sirmeowingtons5.interviewapp.ui.screen.shared.component.LoadingComponent
import com.sirmeowingtons5.interviewapp.presentation.interview.details.InterviewDetailsScreenState as ScreenState

@Composable
fun InterviewDetailsScreen(id: ID, viewModel: InterviewDetailsViewModel = hiltViewModel()) {
    val state: ScreenState by viewModel.state.collectAsState()
    viewModel.load(id)

    when (val currentState = state) {
        is ScreenState.Success -> InterviewDetailsContent(currentState.data)
        is ScreenState.Loading -> LoadingComponent()
        is ScreenState.Error -> ErrorComponent(currentState.exception.toString())
    }
}

@Composable
private fun InterviewDetailsContent(interview: Interview) {
    Column {
        HeaderContent(interview.title)
        IntervieweeContent(interview.interviewee)
    }
}

@Composable
private fun HeaderContent(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.h5
    )
}

@Composable
private fun IntervieweeContent(interviewee: Person) {
    Text(
        text = "${interviewee.firstName} ${interviewee.lastName}",
        style = MaterialTheme.typography.h6
    )
}

//TODO: move to separate files

@Composable
private fun BlockContent(block: Block) {
    Text(text = block.title)
    LazyColumn() {
        items(block.sections) {
            TODO()
        }
    }
}

@Composable
private fun SectionContent() {
    TODO()
}

@Composable
private fun QuestionContent() {
    TODO()
}