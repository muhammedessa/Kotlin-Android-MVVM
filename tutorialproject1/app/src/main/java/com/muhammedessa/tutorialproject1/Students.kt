package com.muhammedessa.tutorialproject1

abstract class Students(name:String,age:Int,address: String) {
    init {
        println("My info is : $name and $age")
    }
    fun showInfo(salary:Double){
        println("My salary is : $salary")
    }
    abstract fun printInfo(name:String,age:Int,address:String)
}

class Muhammed1(name:String,age:Int,address: String):Students(name,age,address){
    override fun printInfo(name: String, age: Int, address: String) {
        println("My info is : $name and $age , $address")
    }
}

fun main(){
    val m1 = Muhammed1("muhammed",34,"Iraq")
    m1.printInfo("muhammed",34,"Iraq")
}