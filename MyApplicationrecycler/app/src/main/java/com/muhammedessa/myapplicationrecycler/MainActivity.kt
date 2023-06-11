package com.muhammedessa.myapplicationrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.muhammedessa.myapplicationrecycler.models.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView :RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        var userslist : ArrayList<User> = ArrayList()
        val user1 = User("Muhammed", R.drawable.a1)
        val user2 = User("Ahmed", R.drawable.a2)
        val user3 = User("Osama", R.drawable.a3)
        val user4 = User("yahya", R.drawable.a4)
        val user5 = User("Salih", R.drawable.a5)
        val user6 = User("Ali", R.drawable.a6)

        userslist.add(user1)
        userslist.add(user2)
        userslist.add(user3)
        userslist.add(user4)
        userslist.add(user5)
        userslist.add(user6)

        val adapter = MyAdapter(userslist)
        recyclerView.adapter = adapter
    }












}