package com.muhammedessa.myfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1:Button = findViewById(R.id.button1)
        val btn2:Button = findViewById(R.id.button2)
        btn1.setOnClickListener {
            val framgment1 :Fragment = Fragment1()
            val fragTrans : FragmentTransaction = supportFragmentManager.beginTransaction()
            fragTrans.replace(R.id.frame1,framgment1).commit()
        }

        btn2.setOnClickListener {
            val framgment2 :Fragment = Fragment2()
            val fragTrans2 : FragmentTransaction = supportFragmentManager.beginTransaction()
            fragTrans2.replace(R.id.frame2,framgment2).commit()
        }


    }
}