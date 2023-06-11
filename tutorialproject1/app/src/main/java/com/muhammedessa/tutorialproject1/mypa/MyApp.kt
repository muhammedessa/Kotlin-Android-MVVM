package com.muhammedessa.tutorialproject1.mypa

fun main(){


//    var name = "Muhammed"
//    name = "Ahmed"
//    val lname = "Essa"
//    var age = 40

    // print age of student
  var  age = 33  // print age of student

    /*
    asdasdasdasdasdasdasdsadasdasdasdsadasd
    sadasdasdasdasdasdasdas
    asdasdasdasdasdasd
     */

//    val mynum: Byte = 115 //-128 to 127
//    val num2 : Short = 32767 // -32768 to 32767
//    val num3 : Int = 1212211111 // -2 31 to 2 31
//    val num4 : Long = 34L // -2 63 to 2 63
//    val num5 : Double = 23.44444  //64 bits
//    val num6 : Float = 23.44444F  //32 bits

//   println(mynum)
//    println(num2)
//    println(num3)
//    println("My age is =  $num4")
//
//    val mychar: Char = 'A'
//    val mynames: String = "Muhammed Essa Hameed"
//
//    val mystatus = true


    val num1 = 22.2
    val num2 = 20.2
    var result:Double

    //Arithmetic operators
    result = num1 + num2
    println(result)
    result = num1 - num2
    println(result)
    result = num1 * num2
    println(result)
    result = num1 / num2
    println(result)
    result = num1 % num2
    println(result)

    val name = "Muhammed "
    val lname = "Essa "
    println(name + lname + "Hameed")

    //Assignment operators

    var num3 = 2
//    num3 += 1
    num3 *= 2

    println(num3)

    //unary operators

    var num4 = 33
    num4++
    println(num4)


    --num4
    println(num4)


    // in operator

    val nums = intArrayOf(1,2,3,4,5,6)

    if (4 in nums){
        println("Yes")
    }

}