package com.muhammedessa.myapplicationlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.muhammedessa.myapplicationlist.Model.Person

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView :ListView = findViewById(R.id.listview1)
        var list = mutableListOf<Person>()
        list.add(Person("Muhammed","Muhammed Essa Hameed", R.drawable.images))
        list.add(Person("Ahmed","Ahmed Essa Hameed", R.drawable.images))
        list.add(Person("Osama","Osama Essa Hameed", R.drawable.images))
        list.add(Person("Hassan","Hassan Essa Hameed", R.drawable.images))
        list.add(Person("Samir","Samir Essa Hameed", R.drawable.images))


        listView.adapter = MyListAdapter(this,R.layout.list_item,list)

//        listView.setOnItemClickListener{
//            parent,view,position,id->
//            if (position == 0){
//                Toast.makeText(this,"Item 1", Toast.LENGTH_SHORT).show()
//            }
//            if (position == 1){
//                Toast.makeText(this,"Item 2", Toast.LENGTH_SHORT).show()
//            }
//            if (position == 2){
//                Toast.makeText(this,"Item 3", Toast.LENGTH_SHORT).show()
//            }
//            if (position == 3){
//                Toast.makeText(this,"Item 4", Toast.LENGTH_SHORT).show()
//            }
//            if (position == 4){
//                Toast.makeText(this,"Item 5", Toast.LENGTH_SHORT).show()
//            }
//        }

    }
}