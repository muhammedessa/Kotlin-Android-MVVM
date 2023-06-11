package com.muhammedessa.androidkotlinproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val mywebView: WebView = findViewById(R.id.webview)
        mywebView.loadUrl("https://www.google.com")
        mywebView.settings.javaScriptEnabled = true
        mywebView.settings.setSupportZoom(true)

//        val  btnGoToSecondActivity: Button = findViewById(R.id.button2)
//        btnGoToSecondActivity.setOnClickListener {
//            val intent = Intent(this,MainActivity::class.java)
//            startActivity(intent)
//        }

    }
}