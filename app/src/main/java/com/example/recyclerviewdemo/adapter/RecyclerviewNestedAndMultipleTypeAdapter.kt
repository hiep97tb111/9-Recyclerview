package com.example.recyclerviewdemo.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.R
import com.example.recyclerviewdemo.model.RecyclerviewNestedAndMultipleTypeOneModel

class RecyclerviewNestedAndMultipleTypeAdapter(private val listFunctions: ArrayList<RecyclerviewNestedAndMultipleTypeOneModel>, private val listPicture: ArrayList<Int>, private val context: Context)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class ParentTypeOneViewHolder (view: View) : RecyclerView.ViewHolder(view){
        private val recyclerviewParentTypeOne: RecyclerView = view.findViewById(R.id.recyclerviewParentTypeOne)
        fun bind(listFunctions: ArrayList<RecyclerviewNestedAndMultipleTypeOneModel>){
            Log.e("Logger", listFunctions.size.toString())
            val recyclerviewNestedAndMultipleTypeOneAdapter = RecyclerviewNestedAndMultipleTypeOneAdapter(listFunctions)
            recyclerviewParentTypeOne.layoutManager = GridLayoutManager(context, 2)
            recyclerviewParentTypeOne.adapter = recyclerviewNestedAndMultipleTypeOneAdapter
        }
    }



    inner class ParentTypeTwoViewHolder (view: View) : RecyclerView.ViewHolder(view){
        private val recyclerviewParentTypeTwo: RecyclerView = view.findViewById(R.id.recyclerviewParentTypeTwo)
        fun bind(listPicture: ArrayList<Int>){
            Log.e("Logger", listPicture.size.toString())
            val recyclerviewNestedAndMultipleTypeTwoAdapter = RecyclerviewNestedAndMultipleTypeTwoAdapter(listPicture)
            recyclerviewParentTypeTwo.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
            recyclerviewParentTypeTwo.adapter = recyclerviewNestedAndMultipleTypeTwoAdapter
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            in 0 until 1 -> ViewType.TypeOne.type
            else -> ViewType.TypeTwo.type
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType){
            ViewType.TypeOne.type -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview_parent_type_one, parent, false)
                return ParentTypeOneViewHolder(view)
            }
            else -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview_parent_type_two, parent, false)
                return ParentTypeTwoViewHolder(view)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.apply {
            when (holder){
                is ParentTypeOneViewHolder -> holder.bind(listFunctions)
                is ParentTypeTwoViewHolder -> holder.bind(listPicture)
            }
        }
    }

    override fun getItemCount(): Int {
        return 2
    }

    enum class ViewType(val type: Int){
        TypeOne(0),
        TypeTwo(1)
    }

}