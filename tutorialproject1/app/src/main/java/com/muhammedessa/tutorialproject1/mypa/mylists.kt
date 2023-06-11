package com.muhammedessa.tutorialproject1.mypa

fun main(){
    val names = listOf("Muhammed", "Muhammed","Essa", "Hameed")
//    println(names)

    val names2 = mutableListOf("Muhammed", "Muhammed","Essa", "Hameed")
//    println(names2)

//    println(names2.toString())

//    val mylists = names.listIterator()
//    while (mylists.hasNext()){
//        println(mylists.next())
//    }

    for (x in names){
        println(x)
    }

     println(names.size)

        if ("Muhammed" in names){
        println("Yes")
    }

    if (names.contains("Essa")){
        println("Yes")
    }

      println( names.isEmpty() )


    val names3 = listOf("Muhammed", "Hassan","Essa", "Hameed")

    println( names.indexOf("Hameed") )

    val names4 = mutableListOf("Muhammed", "Hassan","Essa")
    println( names4)
    names4.add("Ali")
    names4.add("Osama")
    println( names4)
    names4.remove("Hassan")
    println( names4)

    val nums = mutableListOf(1,2,3,4,5)

    println( nums)
}