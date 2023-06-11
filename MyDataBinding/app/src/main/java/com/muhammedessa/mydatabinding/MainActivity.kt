package com.muhammedessa.mydatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.muhammedessa.mydatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var viewModel:MainActivityViewModel
    private lateinit var factory:MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //    setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        factory = MainActivityViewModelFactory(14)
        viewModel = ViewModelProvider(this,factory).get(MainActivityViewModel::class.java)
//        val editText: EditText = findViewById(R.id.editTextText)
//        val textView: TextView = findViewById(R.id.textView)
//        val btn: Button = findViewById(R.id.button)

        var student = Student(12,"Muhammed","Kotlin")
        binding.student  = student

        binding.button.setOnClickListener {
            var newText :String = binding.editTextText.text.toString()
            binding.textView.setText(newText)
        }

//        binding.textView5.text = viewModel.getStatus().toString()
//
//        binding.button2.setOnClickListener {
//            binding.textView5.text = viewModel.getUpdateStatus().toString()
//        }

        viewModel.total.observe(
            this,
            Observer {
                binding.textView5.text = it.toString()
            }
        )

           binding.button2.setOnClickListener {
            viewModel.getSum(binding.editTextText.text.toString().toInt())
         }

//        binding.textView2.setText(""+student.id)
//        binding.textView3.setText(""+student.name)
//        binding.textView4.setText(""+student.department)

//        binding.apply {
//            button.setOnClickListener {
//             var newText :String = editTextText.text.toString()
//             textView.setText(newText)
//       }

 //       }
    }
}