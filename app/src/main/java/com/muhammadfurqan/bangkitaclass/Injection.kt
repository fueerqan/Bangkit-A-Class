package com.muhammadfurqan.bangkitaclass

import android.content.Context
import com.muhammadfurqan.bangkitaclass.data.BookRepository
import com.muhammadfurqan.bangkitaclass.data.db.BookDb
import com.muhammadfurqan.bangkitaclass.data.db.LocalDataSource

/**
 * @author by furqan on 29/04/2021
 */
object Injection {
    fun provideRepository(context: Context): BookRepository {
        val database = BookDb.getDatabase(context)
        val localDataSource = LocalDataSource.getInstance(database.bookDao())

        return BookRepository.getInstance(localDataSource)
    }
}