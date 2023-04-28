package com.example.recyclerviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.adapter.RecyclerviewNestedAndMultipleTypeAdapter
import com.example.recyclerviewdemo.model.RecyclerviewNestedAndMultipleTypeOneModel

class RecyclerviewNestedAndMultipleTypeAct: AppCompatActivity() {
    private lateinit var recyclerviewNestedAndMultipleTypeAdapter: RecyclerviewNestedAndMultipleTypeAdapter
    private lateinit var recyclerviewNestedAndMultipleType: RecyclerView

    private lateinit var listFunctions: ArrayList<RecyclerviewNestedAndMultipleTypeOneModel>
    private lateinit var listPicture: ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_recyclerview_nested_and_multiple_type)

        initData()

        initViews()
    }

    private fun initData() {
        listFunctions = ArrayList()
        listPicture = ArrayList()

        // add List Functions
        listFunctions.add(RecyclerviewNestedAndMultipleTypeOneModel(R.drawable.ic_everton, "Everton"))
        listFunctions.add(RecyclerviewNestedAndMultipleTypeOneModel(R.drawable.ic_tottenham, "Tottenham"))
        listFunctions.add(RecyclerviewNestedAndMultipleTypeOneModel(R.drawable.ic_liverpool, "Liverpool"))
        listFunctions.add(RecyclerviewNestedAndMultipleTypeOneModel(R.drawable.ic_newcastle, "Newcastle"))
        listFunctions.add(RecyclerviewNestedAndMultipleTypeOneModel(R.drawable.ic_chelsea, "Chelsea"))
        listFunctions.add(RecyclerviewNestedAndMultipleTypeOneModel(R.drawable.ic_arsenal, "Arsenal"))
        listFunctions.add(RecyclerviewNestedAndMultipleTypeOneModel(R.drawable.ic_manchester_united, "ManUnited"))
        listFunctions.add(RecyclerviewNestedAndMultipleTypeOneModel(R.drawable.ic_background, "ThaiBinh"))

        // add List Picture
        listPicture.add(R.drawable.ic_manchester_united)
        listPicture.add(R.drawable.ic_arsenal)
        listPicture.add(R.drawable.ic_chelsea)
        listPicture.add(R.drawable.ic_newcastle)
        listPicture.add(R.drawable.ic_liverpool)
        listPicture.add(R.drawable.ic_tottenham)
        listPicture.add(R.drawable.ic_everton)
        listPicture.add(R.drawable.ic_background)

    }

    private fun initViews() {
        recyclerviewNestedAndMultipleTypeAdapter = RecyclerviewNestedAndMultipleTypeAdapter(listFunctions, listPicture, this)

        recyclerviewNestedAndMultipleType = findViewById(R.id.recyclerviewNestedAndMultipleType)
        recyclerviewNestedAndMultipleType.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerviewNestedAndMultipleType.adapter = recyclerviewNestedAndMultipleTypeAdapter
    }

}