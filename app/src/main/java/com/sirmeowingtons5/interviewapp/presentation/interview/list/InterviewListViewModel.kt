package com.sirmeowingtons5.interviewapp.presentation.interview.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sirmeowingtons5.interviewapp.domain.usecase.GetAllInterviewsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.sirmeowingtons5.interviewapp.presentation.interview.list.InterviewListScreenState as ScreenState

@HiltViewModel
class InterviewListViewModel @Inject constructor(
    private val getAllInterviewsUseCase: GetAllInterviewsUseCase,
) : ViewModel() {

    private val _state = MutableStateFlow<ScreenState>(ScreenState.Loading)
    val state = _state.asStateFlow()

    fun load() {
        _state.value = ScreenState.Loading

        //TODO: error handling
        viewModelScope.launch {
            val data = getAllInterviewsUseCase()
            _state.value = ScreenState.Success(data)
        }
    }
}