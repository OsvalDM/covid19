package com.example.kotllin.covid.framework.adapters.viewHolders

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.kotllin.covid.data.network.model.Historial
import com.example.kotllin.covid.databinding.ItemMainBinding

class HistorialViewHolder (private val binding: ItemMainBinding) : RecyclerView.ViewHolder(binding.root)  {

    fun bind(item: Historial, context: Context){
        binding.TVnew.text = "Nuevos: " + item.new.toString()
        binding.TVdate.text = item.fecha
        binding.TVtotal.text = "Total" + item.total.toString()
    }
}