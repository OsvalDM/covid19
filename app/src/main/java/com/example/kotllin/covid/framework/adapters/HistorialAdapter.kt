package com.example.kotllin.covid.framework.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotllin.covid.data.network.model.Historial
import com.example.kotllin.covid.databinding.ItemMainBinding
import com.example.kotllin.covid.framework.adapters.viewHolders.HistorialViewHolder

class HistorialAdapter: RecyclerView.Adapter<HistorialViewHolder>() {
    var data:ArrayList<Historial> = ArrayList()
    lateinit var context: Context

    fun HistorialAdapter(basicData : ArrayList<Historial>, context: Context){
        this.data = basicData
        this.context = context
    }

    override fun onBindViewHolder(holder: HistorialViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item, context)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistorialViewHolder {
        val binding = ItemMainBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return HistorialViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return data.size
    }
}