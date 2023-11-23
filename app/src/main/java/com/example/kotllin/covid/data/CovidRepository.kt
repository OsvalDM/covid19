package com.example.kotllin.covid.data

import com.example.kotllin.covid.data.network.CovidApiClient
import com.example.kotllin.covid.data.network.model.covid.Registro

class CovidRepository {
    private val api = CovidApiClient()

    suspend fun  getRegistro(): Registro? = api.getRegistro()
}