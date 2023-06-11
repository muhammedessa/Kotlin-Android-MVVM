package com.muhammedessa.mymvvmapplication.edit

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.muhammedessa.mymvvmapplication.api.RetrofitInstance
import com.muhammedessa.mymvvmapplication.models.Post
import com.muhammedessa.mymvvmapplication.models.User
import kotlinx.coroutines.launch

class EditViewModel:ViewModel() {

    private  val _post = MutableLiveData<Post>()
    val post: LiveData<Post>
        get() = _post

    fun updatePost(postId:Int, updatePostData:Post){
        viewModelScope.launch {
             try{
                 _post.value = null
                 val updatedPost = RetrofitInstance.api.updatePost(postId,updatePostData)
                 Log.d("updated info","Updated successfully")
                 _post.value = updatedPost
             }catch (e:Exception){
             }
        }
    }

    fun deletePost(postId:Int){
        viewModelScope.launch {
            try{
                _post.value = null
                val updatedPost = RetrofitInstance.api.deletePost(postId)
                Log.d("delete info","deleted successfully")
                _post.value = null
            }catch (e:Exception){
            }
        }
    }
}