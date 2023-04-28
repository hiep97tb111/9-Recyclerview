package com.example.recyclerviewdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.R
import com.example.recyclerviewdemo.model.RecyclerviewNestedAndMultipleTypeOneModel

class RecyclerviewNestedAndMultipleTypeOneAdapter(private val listFunctions: ArrayList<RecyclerviewNestedAndMultipleTypeOneModel>)
    : RecyclerView.Adapter<RecyclerviewNestedAndMultipleTypeOneAdapter.ViewHolder>()
{
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imvPictureChild: ImageView = view.findViewById(R.id.imvPictureChild)
        val tvTitleChild: TextView = view.findViewById(R.id.tvTitleChild)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview_nested_child, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = listFunctions[position]
        holder.imvPictureChild.setImageResource(model.picture)
        holder.tvTitleChild.text = model.title
    }

    override fun getItemCount(): Int {
        return listFunctions.size
    }
}