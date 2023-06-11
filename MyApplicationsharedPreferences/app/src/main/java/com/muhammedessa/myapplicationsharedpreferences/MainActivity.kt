package com.muhammedessa.myapplicationsharedpreferences

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var saved_text :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText:EditText = findViewById(R.id.editTextText)
        saved_text = findViewById(R.id.textView2)
        val btn:Button = findViewById(R.id.button)

        ShowStoredInfo()

        btn.setOnClickListener {
            val saved_text :String = editText.text.toString()
            saveInfoData(saved_text)
        }


    }

    private fun saveInfoData(saved_text: String) {
        val sharedPreferences: SharedPreferences = getSharedPreferences("name", MODE_PRIVATE)
        val save_some_text: SharedPreferences.Editor = sharedPreferences.edit()
        save_some_text.putString("name", saved_text).commit()
    }

    private fun ShowStoredInfo() {
        val sharedPreferences: SharedPreferences = getSharedPreferences("name", MODE_PRIVATE)
        val text1: String? = sharedPreferences.getString("name", "")
        saved_text.setText(text1)
    }
}