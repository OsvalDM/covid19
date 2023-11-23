package com.example.kotllin.covid.domain

import com.example.kotllin.covid.data.CovidRepository
import com.example.kotllin.covid.data.network.model.covid.Registro

class CovidListInfoRequirement {
    private val repository = CovidRepository()

    suspend operator fun invoke(
    ): Registro? = repository.getRegistro()
}