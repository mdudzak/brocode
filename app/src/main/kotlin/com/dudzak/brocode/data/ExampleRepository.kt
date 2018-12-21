package com.dudzak.brocode.data

import com.dudzak.brocode.data.local.ExampleRoomDb
import com.dudzak.brocode.data.remote.RemoteApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleRepository @Inject constructor(
    private val db: ExampleRoomDb,
    private val api: RemoteApi) {
}