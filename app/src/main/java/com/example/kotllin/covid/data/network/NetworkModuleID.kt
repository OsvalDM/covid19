package com.example.kotllin.covid.data.network

import com.example.kotllin.covid.utils.Constans
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModuleID {
    private val gsonFactory: GsonConverterFactory = GsonConverterFactory.create()
    private val okHttpClient: OkHttpClient = OkHttpClient()

    operator fun invoke(): CovidApiService {
        return Retrofit.Builder()
            .baseUrl(Constans.BASE_URL)
            .client(NetworkModuleID.okHttpClient)
            .addConverterFactory(NetworkModuleID.gsonFactory)
            .build()
            .create(CovidApiService::class.java)
    }
}