package com.muhammadfurqan.bangkitaclass.data

import androidx.lifecycle.LiveData
import com.muhammadfurqan.bangkitaclass.data.db.LocalDataSource
import com.muhammadfurqan.bangkitaclass.data.db.entity.BookEntity

/**
 * @author by furqan on 29/04/2021
 */
class BookRepository constructor(
    private val localDataSource: LocalDataSource
) {

    fun getAllBooks(): LiveData<List<BookEntity>> = localDataSource.getAllBooks()

    fun addNewBook(bookEntity: BookEntity) = localDataSource.addNewBook(bookEntity)

    fun deleteBook(bookEntity: BookEntity) = localDataSource.deleteBook(bookEntity)

    companion object {
        @Volatile
        private var INSTANCE: BookRepository? = null

        fun getInstance(localDataSource: LocalDataSource): BookRepository =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: BookRepository(localDataSource)
            }
    }

}