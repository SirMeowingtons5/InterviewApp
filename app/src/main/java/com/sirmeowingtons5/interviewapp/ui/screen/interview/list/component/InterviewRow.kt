package com.sirmeowingtons5.interviewapp.ui.screen.interview.list.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview
import com.sirmeowingtons5.interviewapp.domain.entity.interview.InterviewState

@Composable
fun InterviewRow(
    interview: Interview,
    onClick: () -> Unit
) {
    InterviewRowComponent(
        title = interview.title,
        description = interview.description,
        interviewee = "${interview.interviewee.firstName} ${interview.interviewee.lastName}",
        state = interview.state,
        modifier = Modifier.clickable(onClick = onClick)
    )
}

@Composable
fun InterviewRowComponent(
    title: String,
    description: String,
    interviewee: String,
    state: InterviewState,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(size = 4.dp),
        elevation = 4.dp,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = title,
                style = MaterialTheme.typography.h5,
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = interviewee,
                style = MaterialTheme.typography.h6,
            )
            Spacer(modifier = Modifier.height(4.dp))
            InterviewStateComponent(state = state)
        }
    }
}

@Composable
fun InterviewStateComponent(state: InterviewState) {
    val text = when (state) {
        InterviewState.NOT_STARTED -> "Not started"
        InterviewState.IN_PROCESS -> "In process"
        InterviewState.FINISHED -> "Finished"
    }

    Text(
        text = text,
        style = MaterialTheme.typography.caption,
    )
}