package com.example.recyclerviewdemo.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.R
import com.example.recyclerviewdemo.RecyclerviewMultipleTypeAct
import com.example.recyclerviewdemo.model.RecyclerviewMultipleTypeModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class RecyclerviewMultipleAdapter(private val listData: ArrayList<RecyclerviewMultipleTypeModel>, private val onItemClick: (RecyclerviewMultipleTypeModel) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>()  {
    class TextTypeViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val tvTitleTextType: TextView = view.findViewById(R.id.tvTitleTextType)
        val cardViewTextType: CardView = view.findViewById(R.id.cardViewTextType)
    }

    class ImageTypeViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val tvTitleImageType: TextView = view.findViewById(R.id.tvTitleImageType)
        val imvImageType: ImageView = view.findViewById(R.id.imvImageType)
        val cardViewImageType: CardView = view.findViewById(R.id.cardViewImageType)
    }

    class AudioTypeViewHolder  (view: View) : RecyclerView.ViewHolder(view){
        val tvTitleAudioType: TextView = view.findViewById(R.id.tvTitleAudioType)
        val fab: FloatingActionButton = view.findViewById(R.id.fab)
        val cardViewAudioType: CardView = view.findViewById(R.id.cardViewAudioType)
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
        val recyclerviewMultipleTypeModel: RecyclerviewMultipleTypeModel =  listData[position]
        Log.e("Logger", holder.itemViewType.toString())
        when(holder.itemViewType){
            RecyclerviewMultipleTypeAct.textType  -> {
                val viewHolder = holder as TextTypeViewHolder
                viewHolder.tvTitleTextType.text = recyclerviewMultipleTypeModel.title

                viewHolder.cardViewTextType.setOnClickListener {
                    onItemClick(recyclerviewMultipleTypeModel)
                }
            }

            RecyclerviewMultipleTypeAct.imageType -> {
                val viewHolder = holder as ImageTypeViewHolder
                viewHolder.tvTitleImageType.text = recyclerviewMultipleTypeModel.title
                viewHolder.imvImageType.setImageResource(R.drawable.ic_launcher_background)

                viewHolder.cardViewImageType.setOnClickListener {
                    onItemClick(recyclerviewMultipleTypeModel)
                }
            }

            RecyclerviewMultipleTypeAct.audioType -> {
                val viewHolder = holder as AudioTypeViewHolder
                viewHolder.tvTitleAudioType.text = recyclerviewMultipleTypeModel.title

                viewHolder.cardViewAudioType.setOnClickListener {
                    onItemClick(recyclerviewMultipleTypeModel)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }

}