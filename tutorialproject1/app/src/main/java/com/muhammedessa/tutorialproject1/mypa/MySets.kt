package com.muhammedessa.tutorialproject1.mypa

fun main(){
    val numbers1 = setOf(1,2,3,4,5,6,7)
    val names = setOf("Muhammed","Essa", "Hameed")

    println(numbers1)
    println(names)

    for (x in names){
        println(x)
    }

    println(names.elementAt(1))

    val names1 = setOf("Muhammed","Essa" )
    val names2 = setOf( "Hameed", "Hassan")
    val result = names1 + names2

    println(result)

}