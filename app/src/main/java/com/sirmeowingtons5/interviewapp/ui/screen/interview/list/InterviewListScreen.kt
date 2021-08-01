package com.sirmeowingtons5.interviewapp.ui.screen.interview.list

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sirmeowingtons5.interviewapp.domain.entity.interview.Interview
import com.sirmeowingtons5.interviewapp.presentation.interview.list.InterviewListViewModel
import com.sirmeowingtons5.interviewapp.ui.screen.interview.list.component.InterviewRow
import com.sirmeowingtons5.interviewapp.presentation.interview.list.InterviewListScreenState as ScreenState

@Composable
fun InterviewListRootScreen(viewModel: InterviewListViewModel = viewModel()) {
    val state: ScreenState by viewModel.state.collectAsState()
    viewModel.load()

    InterviewListScreen(state)
}

@Composable
fun InterviewListScreen(state: ScreenState) {
    when (state) {
        is ScreenState.Success -> InterviewList(state.data)
        is ScreenState.Loading -> Loading()
        is ScreenState.Error -> ErrorDisplay(state.exception.toString())
    }
}

@Composable
fun InterviewList(interviews: List<Interview>) {
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
fun Loading() {
    Text(text = "Loading...")
}

@Composable
fun ErrorDisplay(cause: String) {
    Text(text = "Error caused by: $cause")
}