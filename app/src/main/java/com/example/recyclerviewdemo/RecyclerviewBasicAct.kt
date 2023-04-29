package com.example.recyclerviewdemo

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.ProgressBar
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
    private lateinit var recyclerViewBasicAdapter: RecyclerviewBasicAdapter
    private lateinit var mLayoutManager: LinearLayoutManager
    private lateinit var listData: ArrayList<RecyclerviewBasicModel>
    private lateinit var listDataLoadMore: ArrayList<RecyclerviewBasicModel>

    private lateinit var recyclerviewBasic: RecyclerView
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout
    private lateinit var proBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_recyclerview_basic)

        setDataAll()

        initData()

        initViews()

    }

    private fun initData() {
        listDataLoadMore = ArrayList()

        for (i in 0 until 15){
            listDataLoadMore.add(listData[i])
        }
    }


    private fun setDataAll() {
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

    private fun initViews() {
        recyclerviewBasic = findViewById(R.id.recycler_view_basic)
        swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout)
        proBar = findViewById(R.id.proBar)

        recyclerViewBasicAdapter = RecyclerviewBasicAdapter(listDataLoadMore){ model, position ->
            Toast.makeText(this, model.counter+"/"+position, Toast.LENGTH_SHORT).show()
        }

        recyclerviewBasic.setHasFixedSize(true)
        mLayoutManager = LinearLayoutManager(this)
        recyclerviewBasic.layoutManager = mLayoutManager
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

        recyclerviewBasic.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                if (dy <= 0) return

                Log.e("Logger onScrolled", mLayoutManager.findLastVisibleItemPosition().toString()+"/"+recyclerViewBasicAdapter.itemCount)
                if(! recyclerviewBasic.canScrollVertically(1)){
                    loadMoreData()
                }
            }
        })
    }

    private fun loadMoreData() {
        proBar.visibility = View.VISIBLE

        val start = recyclerViewBasicAdapter.itemCount
        val end = if(listData.size - recyclerViewBasicAdapter.itemCount < 10){
            listData.size
        }else{
            recyclerViewBasicAdapter.itemCount + 10
        }

        Handler().postDelayed({
            for(i in start until end){
                listDataLoadMore.add(listData[i])
            }

            recyclerViewBasicAdapter.newData(listDataLoadMore)
            proBar.visibility = View.GONE

        }, 3000)

    }
}