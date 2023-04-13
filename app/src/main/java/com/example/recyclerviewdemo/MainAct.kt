package com.example.recyclerviewdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_main)

        initViews()
    }

    private fun initViews() {
        findViewById<TextView>(R.id.tvRecyclerviewBasic).setOnClickListener {
            startActivity(Intent(this, RecyclerviewBasicAct::class.java))
        }
    }
}