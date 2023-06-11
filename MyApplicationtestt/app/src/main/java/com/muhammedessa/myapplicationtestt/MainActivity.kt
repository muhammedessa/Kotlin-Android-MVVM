package com.muhammedessa.myapplicationtestt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 : Fragment =  Fragment1()
        val fragFrame : FragmentTransaction = supportFragmentManager.beginTransaction()
        fragFrame.replace(R.id.frame1,fragment1).commit()
    }
}