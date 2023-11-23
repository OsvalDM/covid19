package com.example.kotllin.covid.data.network

import com.example.kotllin.covid.data.network.model.covid.Registro
import com.example.kotllin.covid.utils.Constans

class CovidApiClient {
    private lateinit var api: CovidApiService

    suspend fun getRegistro(): Registro? {
        api = NetworkModuleID()

        return try {
            api.getRegistro(Constans.KEY,Constans.COUNTRY)
        }catch (e: java.lang.Exception) {
            e.printStackTrace()
            null
        }
    }
}