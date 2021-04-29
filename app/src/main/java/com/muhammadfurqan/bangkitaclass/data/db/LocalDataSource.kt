package com.muhammadfurqan.bangkitaclass.data.db

import androidx.lifecycle.LiveData
import com.muhammadfurqan.bangkitaclass.data.db.dao.BookDao
import com.muhammadfurqan.bangkitaclass.data.db.entity.BookEntity

/**
 * @author by furqan on 29/04/2021
 */
class LocalDataSource constructor(private val bookDao: BookDao) {

    fun getAllBooks(): LiveData<List<BookEntity>> = bookDao.getAllBooks()

    fun addNewBook(bookEntity: BookEntity) = bookDao.insertBook(bookEntity)

    fun deleteBook(bookEntity: BookEntity) = bookDao.deleteBook(bookEntity)

    companion object {
        @Volatile
        private var INSTANCE: LocalDataSource? = null

        fun getInstance(bookDao: BookDao): LocalDataSource =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: LocalDataSource(bookDao)
            }

    }
}