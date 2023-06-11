package com.muhammedessa.mymvvmapplication.edit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.muhammedessa.mymvvmapplication.R
import com.muhammedessa.mymvvmapplication.databinding.ActivityEditBinding
import com.muhammedessa.mymvvmapplication.details.EXTRA_POST
import com.muhammedessa.mymvvmapplication.models.Post

class EditActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditBinding
    private lateinit var viewModel: EditViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_edit)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_edit)
        viewModel = ViewModelProvider(this).get(EditViewModel::class.java)

        val post = intent.getSerializableExtra(EXTRA_POST) as Post
        binding.etTitle.setText(post.title)
        binding.etContent.setText(post.body)

        binding.btnUpdatePut.setOnClickListener {
            Toast.makeText(this,"Updated successfuly!",Toast.LENGTH_SHORT).show()
            viewModel.updatePost(post.id,
            Post(
                post.userId,
                post.id,
                binding.etTitle.text.toString(),
                binding.etContent.text.toString()
            )
                )
        }

        binding.btnDelete.setOnClickListener {
            Toast.makeText(this,"Deleted successfuly!",Toast.LENGTH_SHORT).show()
            viewModel.deletePost(post.id )
        }


    }
}