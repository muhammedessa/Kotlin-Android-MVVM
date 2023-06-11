package com.muhammedessa.tutorialproject1.mypa

fun main(){

     //Array
    val names = arrayOf("Muhammed", "Essa", "Hameed")


//    print(names[1])
  //  names.set(2,"Essa")
//    print(names.get(2))
//    print(names.size)
//   for (x in names) {
//       println(x)
//   }
//    if ("Muhammed" in names){
//        println("Yes")
//    }


    val names2 = arrayOf<String>("Muhammed", "Muhammed","Essa", "Hameed")
   for (x in names) {
       println(x)
   }
    println(names2.isEmpty())


}