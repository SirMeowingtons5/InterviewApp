package com.sirmeowingtons5.interviewapp.di

import com.sirmeowingtons5.interviewapp.data.datasource.InterviewDataSource
import com.sirmeowingtons5.interviewapp.data.datasource.LocalInterviewDataSourceImpl
import com.sirmeowingtons5.interviewapp.data.repository.InterviewRepositoryImpl
import com.sirmeowingtons5.interviewapp.domain.repository.InterviewRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun bindInterviewDataSource(
        dataSource: LocalInterviewDataSourceImpl
    ): InterviewDataSource

    @Binds
    abstract fun bindInterviewRepository(
        repository: InterviewRepositoryImpl
    ): InterviewRepository
}