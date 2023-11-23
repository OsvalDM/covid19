package com.example.kotllin.covid.framework.viewModels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotllin.covid.data.network.model.Historial
import com.example.kotllin.covid.data.network.model.covid.Cases
import com.example.kotllin.covid.data.network.model.covid.Registro
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

            if (result != null)
                Log.d("prueba", result[0].country)

            /*
            CoroutineScope(Dispatchers.Main).launch {
                covidObjectLiveData.postValue(listaHistorial)
            }
            */

        }
    }

}