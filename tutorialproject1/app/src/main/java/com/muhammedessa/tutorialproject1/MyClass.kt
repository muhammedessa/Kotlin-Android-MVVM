package com.muhammedessa.tutorialproject1

class MyClass {
    var name:String = "Muhammed"

    fun redMe(){
        println("My name is $name")
    }
}

fun main(){
    val myname = MyClass()
    myname.redMe()
}