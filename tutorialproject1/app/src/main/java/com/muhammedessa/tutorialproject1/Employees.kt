package com.muhammedessa.tutorialproject1

open class Employees () {
//    init {
//        println("Employee info are : $name $age $salary")
//    }
   open fun displayInfo(name:String, age:Int, salary:Double){
       println("Employee info are : $name $age $salary")
    }
}
class Muhammed: Employees()  {
    override fun displayInfo(name:String, age:Int, salary:Double){
        println("Muhammed info are : $name $age $salary")
    }
}

class Ahmed(name:String, age:Int, salary:Double): Employees()  {
        fun showInfo(){
            println("Employee info are : Ahmed" )
        }
    }




fun main(){

   // val muhammed = Muhammed("Muhammed",39,32323.2)
    val ahmed = Ahmed("Ahmed",22,4343.2)
    ahmed.showInfo()
//    muhammed.showInfo()
    val muhammed = Muhammed()
    muhammed.displayInfo("Muhammed",34,343.33)

}