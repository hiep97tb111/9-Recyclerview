package com.example.recyclerviewdemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.adapter.RecyclerviewNestedParentAdapter
import com.example.recyclerviewdemo.model.NestedChildModel
import com.example.recyclerviewdemo.model.NestedParentModel
import java.util.ArrayList

class RecyclerviewNestedAct: AppCompatActivity() {
    private lateinit var listParent: ArrayList<NestedParentModel>
    private lateinit var recyclerviewNestedParentAdapter: RecyclerviewNestedParentAdapter
    private lateinit var recyclerviewNestedParent: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_recyclerview_nested)

        initData()

        initViews()
    }

    private fun initViews() {
        recyclerviewNestedParent = findViewById(R.id.recyclerviewNestedParent)
        recyclerviewNestedParentAdapter = RecyclerviewNestedParentAdapter(listParent, this){ nestedParent, nestedChild ->
             Toast.makeText(this, "Category: ${nestedParent.categoryName}/ Title Item: ${nestedChild.title}", Toast.LENGTH_SHORT).show()

        }

        recyclerviewNestedParent.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerviewNestedParent.adapter = recyclerviewNestedParentAdapter

    }

    private fun initData() {
        val listChildManUnited = ArrayList<NestedChildModel>()
        listChildManUnited.add(NestedChildModel("ManUnited 1", R.drawable.ic_manchester_united))
        listChildManUnited.add(NestedChildModel("ManUnited 2", R.drawable.ic_manchester_united))
        listChildManUnited.add(NestedChildModel("ManUnited 3", R.drawable.ic_manchester_united))
        listChildManUnited.add(NestedChildModel("ManUnited 4", R.drawable.ic_manchester_united))
        listChildManUnited.add(NestedChildModel("ManUnited 5", R.drawable.ic_manchester_united))
        listChildManUnited.add(NestedChildModel("ManUnited 6", R.drawable.ic_manchester_united))

        val listChildArsenal = ArrayList<NestedChildModel>()
        listChildArsenal.add(NestedChildModel("Arsenal 1", R.drawable.ic_arsenal))
        listChildArsenal.add(NestedChildModel("Arsenal 2", R.drawable.ic_arsenal))
        listChildArsenal.add(NestedChildModel("Arsenal 3", R.drawable.ic_arsenal))
        listChildArsenal.add(NestedChildModel("Arsenal 4", R.drawable.ic_arsenal))
        listChildArsenal.add(NestedChildModel("Arsenal 5", R.drawable.ic_arsenal))
        listChildArsenal.add(NestedChildModel("Arsenal 6", R.drawable.ic_arsenal))

        val listChildChelsea = ArrayList<NestedChildModel>()
        listChildChelsea.add(NestedChildModel("Chelsea 1", R.drawable.ic_chelsea))
        listChildChelsea.add(NestedChildModel("Chelsea 2", R.drawable.ic_chelsea))
        listChildChelsea.add(NestedChildModel("Chelsea 3", R.drawable.ic_chelsea))
        listChildChelsea.add(NestedChildModel("Chelsea 4", R.drawable.ic_chelsea))
        listChildChelsea.add(NestedChildModel("Chelsea 5", R.drawable.ic_chelsea))
        listChildChelsea.add(NestedChildModel("Chelsea 6", R.drawable.ic_chelsea))

        val listChildLiverpool = ArrayList<NestedChildModel>()
        listChildLiverpool.add(NestedChildModel("Liverpool 1", R.drawable.ic_liverpool))
        listChildLiverpool.add(NestedChildModel("Liverpool 2", R.drawable.ic_liverpool))
        listChildLiverpool.add(NestedChildModel("Liverpool 3", R.drawable.ic_liverpool))
        listChildLiverpool.add(NestedChildModel("Liverpool 4", R.drawable.ic_liverpool))
        listChildLiverpool.add(NestedChildModel("Liverpool 5", R.drawable.ic_liverpool))
        listChildLiverpool.add(NestedChildModel("Liverpool 6", R.drawable.ic_liverpool))

        val listChildNewcastle = ArrayList<NestedChildModel>()
        listChildNewcastle.add(NestedChildModel("Newcastle 1", R.drawable.ic_newcastle))
        listChildNewcastle.add(NestedChildModel("Newcastle 2", R.drawable.ic_newcastle))
        listChildNewcastle.add(NestedChildModel("Newcastle 3", R.drawable.ic_newcastle))
        listChildNewcastle.add(NestedChildModel("Newcastle 4", R.drawable.ic_newcastle))
        listChildNewcastle.add(NestedChildModel("Newcastle 5", R.drawable.ic_newcastle))
        listChildNewcastle.add(NestedChildModel("Newcastle 6", R.drawable.ic_newcastle))

        listParent = ArrayList<NestedParentModel>()
        listParent.add(NestedParentModel("Manchester United", listChildManUnited))
        listParent.add(NestedParentModel("Arsenal", listChildArsenal))
        listParent.add(NestedParentModel("Chelsea", listChildChelsea))
        listParent.add(NestedParentModel("Liverpool", listChildLiverpool))
        listParent.add(NestedParentModel("Newcastle", listChildNewcastle))
    }
}