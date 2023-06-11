package com.muhammedessa.mymvvmapplication.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.muhammedessa.mymvvmapplication.api.RetrofitInstance
import com.muhammedessa.mymvvmapplication.models.Post
import com.muhammedessa.mymvvmapplication.models.User
import kotlinx.coroutines.launch

class DetailsViewModel:ViewModel() {
    private  val _post = MutableLiveData<Post>()
    val post:LiveData<Post>
        get() = _post

    private  val _user = MutableLiveData<User>()
    val user:LiveData<User>
        get() = _user

    fun getPostDetails(postId:Int){

        val api = RetrofitInstance.api
        viewModelScope.launch {
            val fetchedPost  = api.getPost(postId)
            val fetchedUser  = api.getUser(fetchedPost.userId)
            _post.value = fetchedPost
            _user.value = fetchedUser
        }
    }
}