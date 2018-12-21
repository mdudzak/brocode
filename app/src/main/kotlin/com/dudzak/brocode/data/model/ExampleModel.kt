package com.dudzak.brocode.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ExampleModel")
data class ExampleModel(
    @PrimaryKey val id: Long,
    val content: String
)