package com.example.kotllin.covid.data.network
import com.example.kotllin.covid.data.network.model.covid.Registro
import com.example.kotllin.covid.utils.Constans
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


interface CovidApiService {
    @GET("covid19")
    suspend fun getRegistro(
        @Header(Constans.HEADER) token: String,
        @Query("country") country: String
    ): Registro
}