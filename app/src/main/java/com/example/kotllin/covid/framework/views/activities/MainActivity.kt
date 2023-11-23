package com.example.kotllin.covid.framework.views.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotllin.covid.data.network.model.Historial
import com.example.kotllin.covid.data.network.model.covid.RegistroItem
import com.example.kotllin.covid.databinding.ActivityMainBinding
import com.example.kotllin.covid.framework.adapters.HistorialAdapter
import com.example.kotllin.covid.framework.viewModels.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    private val adapter : HistorialAdapter = HistorialAdapter()
    private lateinit var data:ArrayList<Historial>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeBinding()
        initializeObservers()
        initializeListeners()

        viewModel.getHistorial()
        viewModel.getInfo()
    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun initializeObservers() {
        viewModel.covidObjectLiveData.observe(this) { registroObject ->
            if (registroObject != null) {
                setUpRecyclerView(registroObject)
            }
        }

        viewModel.infoObjectLiveData.observe(this) {info ->
            if (info != null) {
                setUpView(info)
            }
        }
    }

    private fun setUpView(dataForList:ArrayList<Historial>){
        binding.ano1.text = dataForList[0].fecha + ": " + dataForList[0].total
        binding.ano2.text = dataForList[1].fecha + ": " + dataForList[1].total
        binding.ano3.text = dataForList[2].fecha + ": " + dataForList[2].total
        binding.ano4.text = dataForList[3].fecha + ": " + dataForList[3].total
    }
    private fun setUpRecyclerView(dataForList:ArrayList<Historial>){
        binding.rvcovid.setHasFixedSize(true)
        val gridLayoutManager = GridLayoutManager(
            this,
            2,
            GridLayoutManager.VERTICAL,
            false    )
        binding.rvcovid.layoutManager = gridLayoutManager
        adapter.HistorialAdapter(dataForList, this)
        binding.rvcovid.adapter = adapter
    }


    private fun initializeListeners(){

    }
}