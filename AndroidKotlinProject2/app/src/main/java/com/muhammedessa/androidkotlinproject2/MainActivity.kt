package com.muhammedessa.androidkotlinproject2

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val  btnGoToSecondActivity: Button = findViewById(R.id.button1)
        val  btnGoToGoogle: Button = findViewById(R.id.button3)
        val  btnGoToFacebook: Button = findViewById(R.id.button4)
        val  btnSnackbar: Button = findViewById(R.id.button5)

        btnSnackbar.setOnClickListener {

            val myDialog = AlertDialog.Builder(this)
            myDialog.setMessage("Hello im Dialog")
                .setCancelable(false)
                .setPositiveButton("Ok",DialogInterface.OnClickListener{
                    dialog,id -> finish()
                })
                .setNegativeButton("Cancel",DialogInterface.OnClickListener{
                        dialog,id -> dialog.cancel()
                })
                 val alert = myDialog.create()
            alert.setTitle("Muhammed Essa")
            alert.show()

//            val mySnack = Snackbar.make(it,"Hello im Snackbar",Snackbar.LENGTH_SHORT)
//            mySnack.setAction("Cancel", View.OnClickListener {
//                println("Hello am Kotlin snackbar")
//            })
//            mySnack.show()
        }

        btnGoToSecondActivity.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        btnGoToGoogle.setOnClickListener {
            val visitURL = Intent(android.content.Intent.ACTION_VIEW)
            visitURL.data = Uri.parse("https://www.google.com/")
            startActivity(visitURL)
        }

        btnGoToFacebook.setOnClickListener {
            val visitURL = Intent(android.content.Intent.ACTION_VIEW)
            visitURL.data = Uri.parse("https://www.facbook.com/")
            startActivity(visitURL)
        }


    }
}