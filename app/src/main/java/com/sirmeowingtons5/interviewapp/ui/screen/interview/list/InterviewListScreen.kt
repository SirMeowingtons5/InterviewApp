package com.sirmeowingtons5.interviewapp.ui.screen.interview.list

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview
import com.sirmeowingtons5.interviewapp.presentation.interview.list.InterviewListViewModel
import com.sirmeowingtons5.interviewapp.ui.screen.interview.list.component.InterviewRow
import com.sirmeowingtons5.interviewapp.presentation.interview.list.InterviewListScreenState as ScreenState

@Composable
fun InterviewListScreen(viewModel: InterviewListViewModel = hiltViewModel()) {
    val state: ScreenState by viewModel.state.collectAsState()
    viewModel.load()

    when (val currentState = state) {
        is ScreenState.Success -> InterviewList(currentState.data)
        is ScreenState.Loading -> Loading()
        is ScreenState.Error -> ErrorDisplay(currentState.exception.toString())
    }
}

@Composable
private fun InterviewList(interviews: List<Interview>) {
    LazyColumn(
        contentPadding = PaddingValues(all = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(interviews) { interview ->
            InterviewRow(interview = interview, onClick = {
                Log.d("InterviewList", "Clicked interview with id: ${interview.id}")
            })
        }
    }
}

@Composable
private fun Loading() {
    Box(modifier = Modifier.fillMaxSize()) {
        CircularProgressIndicator(Modifier.align(Alignment.Center))
    }
}

@Composable
private fun ErrorDisplay(cause: String) {
    Text(text = "Error caused by: $cause")
}