package com.yugandhar.smartdailyexpensetracker.di

import android.content.Context
import androidx.room.Room
import com.yugandhar.smartdailyexpensetracker.data.local.ExpenseDao
import com.yugandhar.smartdailyexpensetracker.data.local.ExpenseDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext ctx: Context): ExpenseDatabase {
        return Room.databaseBuilder(
            ctx.applicationContext,
            ExpenseDatabase::class.java,
            "expense_db"
        ).build()
    }

    @Provides
    fun provideExpenseDao(db: ExpenseDatabase): ExpenseDao = db.expenseDao()
}