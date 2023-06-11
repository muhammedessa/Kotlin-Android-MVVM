package com.muhammedessa.tutorialproject1


interface MyInterface{
    val num1 :Int
    fun displayInfo():String
    fun showInfo(){
        println("Iam from interface")
    }
}

interface MyInterface2{

    fun printInfo(){
        println("Iam from interface2")
    }
}

class MyClass2: MyInterface,MyInterface2{
    override val num1: Int = 10

    override fun displayInfo() = "Hi am from class MyClass2"

}


class MyOuterClass{
    val myname:String = "Muhammed Essa"
    class MyinnerClass{
        val name2:String = " Hameed"
        fun infoPrintValue() = "Hi Iam from inner class"
    }
}


data class User(val name:String, val age:Int, val salary:Double)

fun main(){
//    val muhammed3 = MyClass2()
//    println("num1 = ${muhammed3.num1}")
//    println(muhammed3.displayInfo())
//    muhammed3.printInfo()
//     val mynewClass = MyOuterClass.MyinnerClass()
//
//    println(mynewClass.name2)
//    println(mynewClass.infoPrintValue())

    val mydata = User("Muhammed",33,23.2)
    println(mydata.name)
    println(mydata.age)
    println(mydata.salary)

}