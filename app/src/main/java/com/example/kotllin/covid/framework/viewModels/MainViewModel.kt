package com.example.kotllin.covid.framework.viewModels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotllin.covid.data.network.model.Historial
import com.example.kotllin.covid.data.network.model.covid.Cases
import com.example.kotllin.covid.data.network.model.covid.Registro
import com.example.kotllin.covid.data.network.model.covid.X20200122
import com.example.kotllin.covid.domain.CovidListInfoRequirement
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.reflect.KProperty1

class MainViewModel: ViewModel() {
    val covidObjectLiveData = MutableLiveData<ArrayList<Historial>?>()
    private val covidListInfoRequirement = CovidListInfoRequirement()

    fun getHistorial(){
        viewModelScope.launch(Dispatchers.IO){
            val result: Registro? = covidListInfoRequirement()
            
            val listaHistorial = ArrayList<Historial>()

            var historialItem = Historial(
                new = result?.get(0)?.cases?.date20200322?.new?: 0,
                total = result?.get(0)?.cases?.date20200322?.total?: 0,
                fecha = "2020-01-22"
            )
            listaHistorial.add(historialItem)

            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200323?.new?: 0,
                total = result?.get(0)?.cases?.date20200323?.total?: 0,
                fecha = "2020-01-23"
            )
            listaHistorial.add(historialItem)

            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200324?.new?: 0,
                total = result?.get(0)?.cases?.date20200324?.total?: 10,
                fecha = "2020-01-24"
            )
            listaHistorial.add(historialItem)
            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200325?.new?: 0,
                total = result?.get(0)?.cases?.date20200325?.total?: 0,
                fecha = "2020-01-25"
            )
            listaHistorial.add(historialItem)
            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200326?.new?: 0,
                total = result?.get(0)?.cases?.date20200326?.total?: 0,
                fecha = "2020-01-26"
            )
            listaHistorial.add(historialItem)
            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200327?.new?: 0,
                total = result?.get(0)?.cases?.date20200327?.total?: 0,
                fecha = "2020-01-27"
            )
            listaHistorial.add(historialItem)
            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200328?.new?: 0,
                total = result?.get(0)?.cases?.date20200328?.total?: 0,
                fecha = "2020-01-28"
            )
            listaHistorial.add(historialItem)
            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200329?.new?: 0,
                total = result?.get(0)?.cases?.date20200329?.total?: 0,
                fecha = "2020-01-29"
            )
            listaHistorial.add(historialItem)
            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200330?.new?: 0,
                total = result?.get(0)?.cases?.date20200330?.total?: 0,
                fecha = "2020-01-30"
            )
            listaHistorial.add(historialItem)
            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200331?.new?: 0,
                total = result?.get(0)?.cases?.date20200331?.total?: 0,
                fecha = "2020-01-31"
            )
            listaHistorial.add(historialItem)

            CoroutineScope(Dispatchers.Main).launch {
                covidObjectLiveData.postValue(listaHistorial)
            }

        }
    }

}