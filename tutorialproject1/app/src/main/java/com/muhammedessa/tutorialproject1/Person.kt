package com.muhammedessa.tutorialproject1

class Person(val firstName:String , val lastName:String)

class Animal(val name:String , val age:Int){
    val myname: String
    val myage : Int
    init {
        myname = name.uppercase()
        myage = age
        println("Animal name is : $myname")
        println("Animal age is : $age")
    }
}

class Student(_name:String = "Ali", _age:Int=30){
    val myname = _name
    val myage = _age
    init {
        println("Student info is : $myname $myage")
    }
}

class Employee{
    var name:String ="Employee"
        get() = field
        set(value) {
            field = value
        }
}

fun main(){
//    val person1 = Person("Muhammed","Essa")
//    val person2 = Person("Ahmed","Hameed")
//    println("My name is : ${person1.firstName} ${person1.lastName}")
//    println("My name is : ${person2.firstName} ${person2.lastName}")
//    var cat1 = Animal("caty", 2)
//    var dog1 = Animal("dog", 3)

//    var st1 = Student()
//    var st2 = Student("Muhammed", 44)
//    var st3 = Student("Ahmed", 22)

   var emp1 = Employee()
    emp1.name = "Hassan"
   print( emp1.name)

}