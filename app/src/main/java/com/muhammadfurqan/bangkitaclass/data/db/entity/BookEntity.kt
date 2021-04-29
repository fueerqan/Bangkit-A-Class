package com.muhammadfurqan.bangkitaclass.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author by furqan on 29/04/2021
 */
@Entity(tableName = "book_table")
data class BookEntity (
    @PrimaryKey
    var uid: Int,

    @ColumnInfo(name = "name")
    var bookName: String
)