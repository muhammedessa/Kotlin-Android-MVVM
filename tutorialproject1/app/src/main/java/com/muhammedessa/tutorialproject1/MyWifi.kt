package com.muhammedessa.tutorialproject1

class MyWifi {
    var isOn:Boolean = false
    fun makeOn(){
        isOn = true
    }
    fun makeOff(){
        isOn = false
    }

    fun showStatus(mystatus:String){
        if (isOn == true){
            println("Wifi is On")
        }else{
            println("Wifi is Off")
        }
    }
}

fun main(){
    var wifi1 = MyWifi()
    var wifi2 = MyWifi()
    wifi1.makeOn()
    wifi2.makeOff()

    wifi1.showStatus("wifi1")
    wifi2.showStatus("wifi2")

}