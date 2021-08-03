package com.sirmeowingtons5.interviewapp.presentation.interview.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sirmeowingtons5.interviewapp.domain.entity.common.ID
import com.sirmeowingtons5.interviewapp.domain.usecase.GetInterviewUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import com.sirmeowingtons5.interviewapp.presentation.interview.details.InterviewDetailsScreenState as ScreenState

@HiltViewModel
class InterviewDetailsViewModel(
    private val getInterviewUseCase: GetInterviewUseCase
) : ViewModel() {

    private val _state = MutableStateFlow<ScreenState>(ScreenState.Loading)
    val state = _state.asStateFlow()

    fun load(id: ID) {
        _state.value = ScreenState.Loading

        viewModelScope.launch {
            val data = getInterviewUseCase(id)
            _state.value = ScreenState.Success(data)
        }
    }
}