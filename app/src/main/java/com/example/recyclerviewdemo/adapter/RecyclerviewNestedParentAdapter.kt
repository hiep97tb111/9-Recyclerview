package com.example.recyclerviewdemo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.R
import com.example.recyclerviewdemo.model.NestedChildModel
import com.example.recyclerviewdemo.model.NestedParentModel

class RecyclerviewNestedParentAdapter(private val listData: ArrayList<NestedParentModel>, private val context: Context): RecyclerView.Adapter<RecyclerviewNestedParentAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvCategoryName: TextView = view.findViewById(R.id.tvCategoryName)
        val recyclerviewNestedChild: RecyclerView = view.findViewById(R.id.recyclerviewNestedChild)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview_nested_parent, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nestedParentModel: NestedParentModel = listData[position]
        holder.tvCategoryName.text = nestedParentModel.categoryName

        handleEventRecyclerviewChild(holder, position, nestedParentModel.listChild)
    }

    private fun handleEventRecyclerviewChild(holder: ViewHolder, position: Int, listChild: ArrayList<NestedChildModel>) {
        val recyclerviewNestedChildAdapter = RecyclerviewNestedChildAdapter(listChild)

        holder.recyclerviewNestedChild.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        holder.recyclerviewNestedChild.adapter = recyclerviewNestedChildAdapter
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}