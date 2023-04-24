package com.example.recyclerviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.adapter.RecyclerviewMultipleAdapter
import com.example.recyclerviewdemo.model.RecyclerviewMultipleTypeModel
import java.util.ArrayList

class RecyclerviewMultipleTypeAct: AppCompatActivity() {
    private lateinit var recyclerviewMultipleType: RecyclerView
    private lateinit var listData: ArrayList<RecyclerviewMultipleTypeModel>
    private lateinit var recyclerviewMultipleAdapter: RecyclerviewMultipleAdapter

    companion object{
        const val textType = 1
        const val imageType = 2
        const val audioType = 3
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_recyclerview_multiple_type)

        initData()

        initViews()
    }

    private fun initData() {
        listData = ArrayList()

        listData.add(RecyclerviewMultipleTypeModel(textType, "Hello. This is the Text-only View Type. Nice to meet you",0))
        listData.add(RecyclerviewMultipleTypeModel(imageType, "Hi. I display a cool image too besides the omnipresent TextView.",R.drawable.ic_launcher_background))
        listData.add(RecyclerviewMultipleTypeModel(audioType, "Hey. Pressing the FAB button will playback an audio file on loop.",R.raw.sound))
        listData.add(RecyclerviewMultipleTypeModel(imageType, "Hi again. Another cool image here. Which one is better?",R.drawable.ic_background))
    }

    private fun initViews() {
        recyclerviewMultipleAdapter = RecyclerviewMultipleAdapter(listData)

        recyclerviewMultipleType = findViewById(R.id.recyclerviewMultipleType)
        recyclerviewMultipleType.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerviewMultipleType.adapter = recyclerviewMultipleAdapter

    }
}