package com.example.recyclerviewdemo.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.R
import com.example.recyclerviewdemo.RecyclerviewMultipleTypeAct
import com.example.recyclerviewdemo.model.RecyclerviewMultipleTypeModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class RecyclerviewMultipleAdapter(private val listData: ArrayList<RecyclerviewMultipleTypeModel>): RecyclerView.Adapter<RecyclerView.ViewHolder>()  {
    class TextTypeViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val tvTitleTextType: TextView = view.findViewById(R.id.tvTitleTextType)
    }

    class ImageTypeViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val tvTitleImageType: TextView = view.findViewById(R.id.tvTitleImageType)
        val imvImageType: ImageView = view.findViewById(R.id.imvImageType)
    }

    class AudioTypeViewHolder  (view: View) : RecyclerView.ViewHolder(view){
        val tvTitleAudioType: TextView = view.findViewById(R.id.tvTitleAudioType)
        val fab: FloatingActionButton = view.findViewById(R.id.fab)
    }

    override fun getItemViewType(position: Int): Int {
        return when (listData[position].type){
            1 -> RecyclerviewMultipleTypeAct.textType
            2 -> RecyclerviewMultipleTypeAct.imageType
            else -> {
                RecyclerviewMultipleTypeAct.audioType
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            RecyclerviewMultipleTypeAct.textType -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.text_type, parent, false)
                TextTypeViewHolder(view)
            }

            RecyclerviewMultipleTypeAct.imageType -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.image_type, parent, false)
                ImageTypeViewHolder(view)
            }

            else -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.audio_type, parent, false)
                AudioTypeViewHolder(view)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model: RecyclerviewMultipleTypeModel =  listData[position]
        Log.e("Logger", holder.itemViewType.toString())
        when(holder.itemViewType){
            RecyclerviewMultipleTypeAct.textType  -> {
                val viewHolder = holder as TextTypeViewHolder
                viewHolder.tvTitleTextType.text = model.title
            }

            RecyclerviewMultipleTypeAct.imageType -> {
                val viewHolder = holder as ImageTypeViewHolder
                viewHolder.tvTitleImageType.text = model.title
                viewHolder.imvImageType.setImageResource(R.drawable.ic_launcher_background)
            }

            RecyclerviewMultipleTypeAct.audioType -> {
                val viewHolder = holder as AudioTypeViewHolder
                viewHolder.tvTitleAudioType.text = model.title
            }
        }

    }

    override fun getItemCount(): Int {
        return listData.size
    }

}