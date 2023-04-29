package com.example.recyclerviewdemo

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.recyclerviewdemo.adapter.RecyclerviewBasicAdapter
import com.example.recyclerviewdemo.model.RecyclerviewBasicModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.ArrayList

class RecyclerviewBasicAct: AppCompatActivity() {
    private lateinit var listData: ArrayList<RecyclerviewBasicModel>
    private lateinit var recyclerViewBasicAdapter: RecyclerviewBasicAdapter

    private lateinit var recyclerviewBasic: RecyclerView
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_recyclerview_basic)

        initData()

        initViews()

    }

    private fun initViews() {
        recyclerviewBasic = findViewById(R.id.recycler_view_basic)
        swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout)

        recyclerViewBasicAdapter = RecyclerviewBasicAdapter(listData){ model, position ->
            Toast.makeText(this, model.counter+"/"+position, Toast.LENGTH_SHORT).show()
        }

        recyclerviewBasic.setHasFixedSize(true)
        recyclerviewBasic.layoutManager = LinearLayoutManager(this)
        recyclerviewBasic.adapter = recyclerViewBasicAdapter

        swipeRefreshLayout.setOnRefreshListener {
            // Handle the refresh action here
            // You can update the content of your view or make a network call to fetch new data
            // Once the refresh is complete, call swipeRefreshLayout.setRefreshing(false) to stop the animation
            Toast.makeText(this, "Reload Data", Toast.LENGTH_SHORT).show()
            CoroutineScope(Dispatchers.Main).launch {
                delay(4000L)
                swipeRefreshLayout.isRefreshing = false
            }
        }
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