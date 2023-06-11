package com.muhammedessa.mydatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(mynum:Int) :ViewModel(){

    private var num1 = MutableLiveData<Int>()
    val total: LiveData<Int>
        get() = num1
    init {
        num1.value = mynum
    }
    fun getSum(input:Int){
        num1.value = ( num1.value)?.plus(input)
    }
//    fun getStatus():Int{
//        return num1
//    }
//    fun getUpdateStatus():Int{
//        return ++num1
//    }
}