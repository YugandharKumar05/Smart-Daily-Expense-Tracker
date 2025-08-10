package com.yugandhar.smartdailyexpensetracker.domain.repository

import com.yugandhar.smartdailyexpensetracker.domain.model.Expense
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

interface ExpenseRepository {
    fun getExpensesForDate(date: LocalDate): Flow<List<Expense>>
    fun getTodayExpenses(): Flow<List<Expense>>
    suspend fun addExpense(expense: Expense)
}