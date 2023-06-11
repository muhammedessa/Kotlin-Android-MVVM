package com.muhammedessa.myfragments2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.muhammedessa.myfragments2.adapters.MyAdapter

class MainActivity : AppCompatActivity() {

//    lateinit var myAdapter:MyAdapter
//    lateinit var viewPager:ViewPager2

    val mytabs = arrayOf("Play", "Phone", "Wifi")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        viewPager = findViewById(R.id.viewPager)
//        myAdapter = MyAdapter(this)
//        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
//        viewPager.adapter = myAdapter
        val viewPager:ViewPager2 = findViewById(R.id.viewPager)
        val tabLayout:TabLayout = findViewById(R.id.tablayout)

        val myAdapter = MyAdapter(
            supportFragmentManager,lifecycle
        )
        viewPager.adapter = myAdapter
        TabLayoutMediator(tabLayout,viewPager){
            tab,position -> tab.text = mytabs[position]
        }.attach()


    }
}