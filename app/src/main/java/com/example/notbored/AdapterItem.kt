package com.example.notbored

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterItem(
    private val lyst : List<String>
    ): RecyclerView.Adapter<AdapterItem.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.activities_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = lyst[position]

        holder.textItem.text = item
    }
//
    override fun getItemCount() = lyst.size

    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val textItem: TextView = itemView.findViewById(R.id.text_item)
    }
}