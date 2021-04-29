package com.muhammadfurqan.bangkitaclass

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.muhammadfurqan.bangkitaclass.data.BookRepository
import com.muhammadfurqan.bangkitaclass.data.db.entity.BookEntity

/**
 * @author by furqan on 29/04/2021
 */
class BookViewModel constructor(private var bookRepository: BookRepository) : ViewModel() {

    fun getAllBooks(): LiveData<List<BookEntity>> =
        bookRepository.getAllBooks()

}