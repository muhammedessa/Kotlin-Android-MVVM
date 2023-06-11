package com.muhammedessa.androidkotlinproject1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1:TextView = findViewById(R.id.textView01)
        val edtext:EditText = findViewById(R.id.editTextText1)
        val btn1:Button = findViewById(R.id.button1)
        val btn2:Button = findViewById(R.id.button2)
        val myImage:ImageView = findViewById(R.id.imageView1)

        myImage.setOnClickListener {
            Toast.makeText(this,"Hello Image",Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener{
            if (btn2.text.toString().equals("Show")){
                edtext.transformationMethod = HideReturnsTransformationMethod.getInstance()
                btn2.text = "Hide"
            }else{
                edtext.transformationMethod = PasswordTransformationMethod.getInstance()
                btn2.text = "Show"
            }
        }

        btn1.setOnClickListener{
            Toast.makeText(this,"Hello Muhammed Essa",Toast.LENGTH_SHORT).show()
            text1.setText(edtext.text.toString())
        }
//        text1.setOnClickListener{
//          //  println("Muhammed Essa")
//            Toast.makeText(this,"Hello Muhammed",Toast.LENGTH_SHORT).show()
//        }

    }
}