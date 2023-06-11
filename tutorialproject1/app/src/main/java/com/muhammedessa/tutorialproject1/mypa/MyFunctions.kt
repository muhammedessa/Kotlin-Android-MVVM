package com.muhammedessa.tutorialproject1.mypa

fun printMyName(){
    println("muhammed essa")
}

fun addNumbers(){
    val num1 = 10
    val num2 = 20
    val result:Int
    result = num1 + num2
    println(result)
}

fun sumNumbers(num1:Int , num2:Int):Int{
    var sum = num1+num2
    return sum
}

fun showName(fistName:String, lastName:String): String{
   // println(fistName +" "+ lastName)
   // val result = fistName + lastName
    return fistName + lastName
}

fun main(){
    printMyName()
    addNumbers()
    println(sumNumbers(2 , 4))
    var myResult = sumNumbers(2 , 4)
    println(myResult + 10)

    println(showName("muhammed", "Essa"))
}