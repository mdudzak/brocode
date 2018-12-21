package com.dudzak.brocode.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dudzak.brocode.data.model.ExampleModel

/**
 * Room database
 */
@Database(entities = [ExampleModel::class], version = 1)
abstract class ExampleRoomDb: RoomDatabase() {
    abstract fun exampleModelDao(): ExampleModelDao
}