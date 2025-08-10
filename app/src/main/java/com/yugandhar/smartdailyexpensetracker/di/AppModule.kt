package com.yugandhar.smartdailyexpensetracker.di

import com.yugandhar.smartdailyexpensetracker.domain.repository.ExpenseRepository
import com.yugandhar.smartdailyexpensetracker.domain.repository.ExpenseRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun bindExpenseRepository(
        impl: ExpenseRepositoryImpl
    ): ExpenseRepository
}