package com.muhammedessa.mymvvmapplication.details

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.muhammedessa.mymvvmapplication.EXTRA_POST_ID
import com.muhammedessa.mymvvmapplication.MainViewModel
import com.muhammedessa.mymvvmapplication.PostAdapter
import com.muhammedessa.mymvvmapplication.R
import com.muhammedessa.mymvvmapplication.databinding.ActivityDetailsBinding
import com.muhammedessa.mymvvmapplication.databinding.ActivityMainBinding
import com.muhammedessa.mymvvmapplication.edit.EditActivity
import com.muhammedessa.mymvvmapplication.models.Post


const val EXTRA_POST = "EXTRA_POST"

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    private lateinit var viewModel: DetailsViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_details)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_details)
        viewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)

        val postId = intent.getIntExtra(EXTRA_POST_ID,-1)

        viewModel.post.observe(this, Observer {
            post ->
            binding.tvPostId.text = "Post ${post.id}"
            binding.tvTitle.text = post.title
            binding.tvBody.text = post.body
        })

        viewModel.user.observe(this, Observer {
                user ->
            binding.tvUserName.text = user.name
            binding.tvUserEmail.text = user.email
            binding.tvUsername.text = user.username
            binding.tvWebsite.text = user.website
        })

        viewModel.getPostDetails(postId)

        binding.buttonEdit.setOnClickListener {
            viewModel.post.observe(this, Observer {
                post ->
                val intent = Intent(this, EditActivity::class.java)
                intent.putExtra(EXTRA_POST, post)
                startActivity(intent)
            }
            )
        }

    }
}