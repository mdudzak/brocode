package com.dudzak.brocode.di.module

import android.content.Context
import androidx.room.Room
import com.dudzak.brocode.data.ExampleRepository
import com.dudzak.brocode.data.local.ExampleRoomDb
import com.dudzak.brocode.data.remote.RemoteApi
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
class DbModule {

    @Provides
    @Reusable
    internal fun provideExampleRepository(exampleRoomDb: ExampleRoomDb, remoteApi: RemoteApi) = ExampleRepository(exampleRoomDb, remoteApi)


    @Provides
    @Reusable
    internal fun provideExampleRoomDb(context: Context) = Room.databaseBuilder(context, ExampleRoomDb::class.java, "tasks.db").build()

}