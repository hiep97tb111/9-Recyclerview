package com.example.recyclerviewdemo.adapter

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.R
import com.example.recyclerviewdemo.model.RecyclerviewBasicModel

class RecyclerviewBasicAdapter(private val listData: ArrayList<RecyclerviewBasicModel>): RecyclerView.Adapter<RecyclerviewBasicAdapter.ViewHolder>() {

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val itemTvCounter: TextView = view.findViewById(R.id.itemTvCounter)
        val itemLayoutBasic: ConstraintLayout = view.findViewById(R.id.itemLayoutBasic)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview_basic, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTvCounter.text = listData[position].counter
        Log.e("Logger", position.toString())

        when {
            position % 3 == 0 -> {
                holder.itemLayoutBasic.setBackgroundColor(Color.GREEN)
            }
            position % 3 == 1 -> {
                holder.itemLayoutBasic.setBackgroundColor(Color.RED)
            }
            else -> {
                holder.itemLayoutBasic.setBackgroundColor(Color.BLUE)
            }
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}