package com.dudzak.brocode.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.dudzak.brocode.data.model.ExampleModel
import io.reactivex.Observable

@Dao
interface ExampleModelDao {

    @Query("SELECT * FROM ExampleModel")
    fun getAll(): Observable<List<ExampleModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(exampleModel: ExampleModel)

}