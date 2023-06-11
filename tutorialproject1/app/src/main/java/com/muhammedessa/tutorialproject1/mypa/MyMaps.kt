package com.muhammedessa.tutorialproject1.mypa

fun main(){


    val studentInfo = mapOf("name" to "Muhammed", "age" to "38", "department" to "IT")

    val studentInfo2 = mutableMapOf("name" to "Muhammed", "age" to "38", "department" to "IT")
    println(studentInfo)
    println(studentInfo2)

    val studentInfo3 = HashMap<String, Int>()
    println(studentInfo3)
    studentInfo3["age1"] = 30
    studentInfo3["age2"] = 33
    studentInfo3["age3"] = 23
    studentInfo3["age4"] = 43
    println(studentInfo3.entries)
    println(studentInfo3.keys)
    println(studentInfo3.values)

    val studentInfo4 = mapOf("name" to "Muhammed", "age" to "38", "department" to "IT")

//    val mystudent = studentInfo4.keys.iterator()
//    while (mystudent.hasNext()){
//        val key = mystudent.next()
//        val value = studentInfo4[key]
//        println("the key is : $key and value is = $value")
//    }
//    for ((k,v) in studentInfo4){
//        println("the key is : $k and value is = $v")
//    }

    studentInfo4.forEach{
        k,v -> println("the key is : $k and value is = $v")
    }


    println(studentInfo4.size)
    println(studentInfo4.count())

//    if (studentInfo4.containsKey("name")){
//        println(true)
//    }
    println(studentInfo4.isEmpty())
    println(studentInfo4.isNotEmpty())

    println(studentInfo4.get("age"))
    println(studentInfo4["age"])


    val studentInfo5 = mapOf("name" to "Muhammed", "age" to "38", "department" to "IT")
    val studentInfo6 = mapOf("address" to "Kirkuk",   "department" to "Developer")

    val studentTotal = studentInfo5 + studentInfo6

    println(studentTotal)
}