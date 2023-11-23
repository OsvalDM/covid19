package com.example.kotllin.covid.framework.views.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.kotllin.covid.data.network.model.Historial
import com.example.kotllin.covid.data.network.model.covid.RegistroItem
import com.example.kotllin.covid.databinding.ActivityMainBinding
import com.example.kotllin.covid.framework.viewModels.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeBinding()
        initializeObservers()
        initializeListeners()

        viewModel.getHistorial()
    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun initializeObservers() {
        viewModel.covidObjectLiveData.observe(this) { registroObject ->
            if (registroObject != null) {
                setUpView(registroObject)
            }
        }
    }

    private fun setUpView(dataForList:ArrayList<Historial>){
    }

    private fun initializeListeners(){

    }
}