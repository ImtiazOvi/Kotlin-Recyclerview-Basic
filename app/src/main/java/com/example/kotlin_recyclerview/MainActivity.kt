package com.example.kotlin_recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_recyclerview.adapter.RecylcerViewAdapter
import com.example.kotlin_recyclerview.model.DataClass

class MainActivity : AppCompatActivity() {


    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting recyclerview from xml
         val recyclerView = findViewById(R.id.recyclerView) as RecyclerView


        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)


        //crating an arraylist to store users using the data class user
        val users = ArrayList<DataClass>()

        //adding some dummy data to the list
        users.add(DataClass("Imtiaz", "Bangladesh"))
        users.add(DataClass("Ovi", "USA"))
        users.add(DataClass("Jack", "Japan"))
        users.add(DataClass("Imran", "Bangladesh"))
        users.add(DataClass("Messi", "Barcelona"))

        //creating our adapter
        val adapter = RecylcerViewAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
    }
}
