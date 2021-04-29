package com.muhammadfurqan.bangkitaclass.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.muhammadfurqan.bangkitaclass.data.db.dao.BookDao
import com.muhammadfurqan.bangkitaclass.data.db.entity.BookEntity

/**
 * @author by furqan on 29/04/2021
 */
@Database(
    entities = [BookEntity::class],
    version = 1
)
abstract class BookDb : RoomDatabase() {

    abstract fun bookDao(): BookDao

    companion object {
        @Volatile
        private var INSTANCE: BookDb? = null

//        private val MIGRATION_1_2 = object : Migration(1, 2) {
//            override fun migrate(database: SupportSQLiteDatabase) {
//                .....
//            }
//
//        }

        fun getDatabase(context: Context): BookDb =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context,
                    BookDb::class.java,
                    "book-db"
                )
//                    .addMigrations(MIGRATION_1_2)
                    .build()
            }
    }

}