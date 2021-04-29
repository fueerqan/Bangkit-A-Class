package com.muhammadfurqan.bangkitaclass.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.muhammadfurqan.bangkitaclass.data.db.entity.BookEntity

/**
 * @author by furqan on 29/04/2021
 */
@Dao
interface BookDao {

    @Query("SELECT * FROM book_table")
    fun getAllBooks(): LiveData<List<BookEntity>>

    @Insert
    fun insertBook(book: BookEntity)

    @Delete
    fun deleteBook(book: BookEntity)

}