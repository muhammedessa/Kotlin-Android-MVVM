package com.muhammedessa.mypasta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muhammedessa.mypasta.databinding.ActivityMainBinding
import com.muhammedessa.mypasta.models.Post

private const val TAG = "MainActivity"
const val EXTRA_POST_ID = "EXTRA_POST_ID"
class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding
    private lateinit var blogPostAdapter: PostAdapter
    private val blogPosts = mutableListOf<Post>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}