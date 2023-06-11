package com.muhammedessa.tutorialproject1.mypa

fun main(){
    val num1 = 18

  val result =   if (num1 >= 18){
         "You are welcome !"
    }else{
         "You are not welcome !"
    }
 //   println(result)


   val myresult =  if (num1 >= 18)  "You are welcome !" else  "You are not welcome !"


   val result2  = if (num1 > 18){
        "You are grater than 18 !"
    }else if (num1 == 18){
        "You are 18 !"
    } else{
        "You are below than 18 !"
    }


   val result3 =  if (num1 >= 18){
        if (num1 == 18){
            "You are 18 !"
        }else{
            "You are grater than 18 !"
        }

    }  else{
        "You are below than 18 !"
    }


    val username = "Muhammed"
    val password = "123456"

    val result4 =  if (username == "Muhammeds"){
        if (password == "123456"){
            "You are Welcome !"
        }else{
            "You not logged in !"
        }

    }  else{
        "check your password and username  !"
    }



    val myday = 6

   val result5 =  when (myday){
        1 -> "sunday"
        2 -> "monday"
        3 -> "tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "saturday"
       else ->  "please put a valid day"
    }


//    when (myday){
//        1 -> println("sunday")
//        2 -> println("monday")
//        3 -> println("tuesday")
//        4 -> println("Wednesday")
//        5 -> println("Thursday")
//        6 -> println("Friday")
//        7 -> println("saturday")
//        else ->  println("please put a valid day")
//    }


//    for(x in 1..9){
//        println(x)
//    }

//    for(x in 9 downTo 1 step 2){
//        println(x)
//    }

    val names = arrayOf("Muhammed", "Essa", "Hameed")
//    for (x in names){
//        println(x)
//    }

//    for (index in names.indices){
//        println(names[index])
//    }

    var x = 0
//    while (x <= 10){
//        println(x);
//        x++
//    }

//var i = 12
//    do{
//        println(i);
//        i++
//    }while (i <= 10)


    while (x++ < 10){
//        println(x);
        if (x == 4) {
           // break
            continue
        }
        println(x);
    }


   // println(result5)
}