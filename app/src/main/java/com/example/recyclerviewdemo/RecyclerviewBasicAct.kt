package com.example.recyclerviewdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.adapter.RecyclerviewBasicAdapter
import com.example.recyclerviewdemo.model.RecyclerviewBasicModel
import java.util.ArrayList

class RecyclerviewBasicAct: AppCompatActivity() {
    private lateinit var listData: ArrayList<RecyclerviewBasicModel>
    private lateinit var recyclerviewBasic: RecyclerView
    private lateinit var recyclerViewBasicAdapter: RecyclerviewBasicAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_recyclerview_basic)

        initData()

        initViews()

    }

    private fun initViews() {
        recyclerviewBasic = findViewById(R.id.recycler_view_basic)
        recyclerViewBasicAdapter = RecyclerviewBasicAdapter(listData)

        recyclerviewBasic.setHasFixedSize(true)
        recyclerviewBasic.layoutManager = LinearLayoutManager(this)
        recyclerviewBasic.adapter = recyclerViewBasicAdapter

        recyclerviewBasic.addOnScrollListener(object : RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if(! recyclerView.canScrollVertically(1)){
                    Log.e("Logger", "onScrolled")
                }
            }
        })
    }

    private fun initData() {
        listData = ArrayList<RecyclerviewBasicModel>()
        listData.add(RecyclerviewBasicModel("Wayne Rooney"))
        listData.add(RecyclerviewBasicModel("Luke Shaw"))
        listData.add(RecyclerviewBasicModel("Rio Ferdinand"))
        listData.add(RecyclerviewBasicModel("Roberto Baggio"))
        listData.add(RecyclerviewBasicModel("Fabio Cannavaro"))
        listData.add(RecyclerviewBasicModel("Michael Essien"))
        listData.add(RecyclerviewBasicModel("Oliver Kahn"))
        listData.add(RecyclerviewBasicModel("Michael Ballack"))
        listData.add(RecyclerviewBasicModel("Franz Beckenbauer"))
        listData.add(RecyclerviewBasicModel("Lothar Matthäus"))

        listData.add(RecyclerviewBasicModel("Wayne Rooney"))
        listData.add(RecyclerviewBasicModel("Luke Shaw"))
        listData.add(RecyclerviewBasicModel("Rio Ferdinand"))
        listData.add(RecyclerviewBasicModel("Roberto Baggio"))
        listData.add(RecyclerviewBasicModel("Fabio Cannavaro"))
        listData.add(RecyclerviewBasicModel("Michael Essien"))
        listData.add(RecyclerviewBasicModel("Oliver Kahn"))
        listData.add(RecyclerviewBasicModel("Michael Ballack"))
        listData.add(RecyclerviewBasicModel("Franz Beckenbauer"))
        listData.add(RecyclerviewBasicModel("Lothar Matthäus"))

        listData.add(RecyclerviewBasicModel("Wayne Rooney"))
        listData.add(RecyclerviewBasicModel("Luke Shaw"))
        listData.add(RecyclerviewBasicModel("Rio Ferdinand"))
        listData.add(RecyclerviewBasicModel("Roberto Baggio"))
        listData.add(RecyclerviewBasicModel("Fabio Cannavaro"))
        listData.add(RecyclerviewBasicModel("Michael Essien"))
        listData.add(RecyclerviewBasicModel("Oliver Kahn"))
        listData.add(RecyclerviewBasicModel("Michael Ballack"))
        listData.add(RecyclerviewBasicModel("Franz Beckenbauer"))
        listData.add(RecyclerviewBasicModel("Lothar Matthäus"))

        listData.add(RecyclerviewBasicModel("Wayne Rooney"))
        listData.add(RecyclerviewBasicModel("Luke Shaw"))
        listData.add(RecyclerviewBasicModel("Rio Ferdinand"))
        listData.add(RecyclerviewBasicModel("Roberto Baggio"))
        listData.add(RecyclerviewBasicModel("Fabio Cannavaro"))
        listData.add(RecyclerviewBasicModel("Michael Essien"))
        listData.add(RecyclerviewBasicModel("Oliver Kahn"))
        listData.add(RecyclerviewBasicModel("Michael Ballack"))
        listData.add(RecyclerviewBasicModel("Franz Beckenbauer"))
        listData.add(RecyclerviewBasicModel("Lothar Matthäus"))

        listData.add(RecyclerviewBasicModel("Wayne Rooney"))
        listData.add(RecyclerviewBasicModel("Luke Shaw"))
        listData.add(RecyclerviewBasicModel("Rio Ferdinand"))
        listData.add(RecyclerviewBasicModel("Roberto Baggio"))
        listData.add(RecyclerviewBasicModel("Fabio Cannavaro"))
        listData.add(RecyclerviewBasicModel("Michael Essien"))
        listData.add(RecyclerviewBasicModel("Oliver Kahn"))
        listData.add(RecyclerviewBasicModel("Michael Ballack"))
        listData.add(RecyclerviewBasicModel("Franz Beckenbauer"))
        listData.add(RecyclerviewBasicModel("Lothar Matthäus"))

        listData.add(RecyclerviewBasicModel("Wayne Rooney"))
        listData.add(RecyclerviewBasicModel("Luke Shaw"))
        listData.add(RecyclerviewBasicModel("Rio Ferdinand"))
        listData.add(RecyclerviewBasicModel("Roberto Baggio"))
        listData.add(RecyclerviewBasicModel("Fabio Cannavaro"))
        listData.add(RecyclerviewBasicModel("Michael Essien"))
        listData.add(RecyclerviewBasicModel("Oliver Kahn"))
        listData.add(RecyclerviewBasicModel("Michael Ballack"))
        listData.add(RecyclerviewBasicModel("Franz Beckenbauer"))
        listData.add(RecyclerviewBasicModel("Lothar Matthäus"))

        listData.add(RecyclerviewBasicModel("Wayne Rooney"))
        listData.add(RecyclerviewBasicModel("Luke Shaw"))
        listData.add(RecyclerviewBasicModel("Rio Ferdinand"))
        listData.add(RecyclerviewBasicModel("Roberto Baggio"))
        listData.add(RecyclerviewBasicModel("Fabio Cannavaro"))
        listData.add(RecyclerviewBasicModel("Michael Essien"))
        listData.add(RecyclerviewBasicModel("Oliver Kahn"))
        listData.add(RecyclerviewBasicModel("Michael Ballack"))
        listData.add(RecyclerviewBasicModel("Franz Beckenbauer"))
        listData.add(RecyclerviewBasicModel("Lothar Matthäus"))


    }
}