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
                new = result?.get(0)?.cases?.date20200122?.total?: 0,
                total = result?.get(0)?.cases?.date20200122?.total?: 0,
                fecha = "2020-01-22"
            )
            listaHistorial.add(historialItem)

            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200123?.total?: 0,
                total = result?.get(0)?.cases?.date20200123?.total?: 0,
                fecha = "2020-01-23"
            )
            listaHistorial.add(historialItem)

            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200124?.total?: 0,
                total = result?.get(0)?.cases?.date20200124?.total?: 0,
                fecha = "2020-01-24"
            )
            listaHistorial.add(historialItem)
            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200125?.total?: 0,
                total = result?.get(0)?.cases?.date20200125?.total?: 0,
                fecha = "2020-01-25"
            )
            listaHistorial.add(historialItem)
            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200126?.total?: 0,
                total = result?.get(0)?.cases?.date20200126?.total?: 0,
                fecha = "2020-01-26"
            )
            listaHistorial.add(historialItem)
            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200127?.total?: 0,
                total = result?.get(0)?.cases?.date20200127?.total?: 0,
                fecha = "2020-01-27"
            )
            listaHistorial.add(historialItem)
            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200128?.total?: 0,
                total = result?.get(0)?.cases?.date20200128?.total?: 0,
                fecha = "2020-01-28"
            )
            listaHistorial.add(historialItem)
            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200129?.total?: 0,
                total = result?.get(0)?.cases?.date20200129?.total?: 0,
                fecha = "2020-01-29"
            )
            listaHistorial.add(historialItem)
            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200130?.total?: 0,
                total = result?.get(0)?.cases?.date20200130?.total?: 0,
                fecha = "2020-01-30"
            )
            listaHistorial.add(historialItem)
            historialItem = Historial(
                new = result?.get(0)?.cases?.date20200131?.total?: 0,
                total = result?.get(0)?.cases?.date20200131?.total?: 0,
                fecha = "2020-01-31"
            )
            listaHistorial.add(historialItem)

            CoroutineScope(Dispatchers.Main).launch {
                covidObjectLiveData.postValue(listaHistorial)
            }

        }
    }

}