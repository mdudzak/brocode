package com.dudzak.brocode.data.remote

import com.dudzak.brocode.data.model.ExampleModel
import io.reactivex.Observable
import retrofit2.http.GET

interface RemoteApi {

    @GET("something")
    fun getSomething(): Observable<ExampleModel>

    companion object {
        const val API_URL = "https://"
    }
}