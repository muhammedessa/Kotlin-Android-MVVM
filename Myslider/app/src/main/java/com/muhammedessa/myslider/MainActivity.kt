package com.muhammedessa.myslider

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity(), LocationListener {

    private lateinit var locationManager: LocationManager
    private lateinit var textLatitude:TextView
    private lateinit var textLongitude:TextView
    private  var localPermissionGPScode = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.button)
        button.setOnClickListener{
            getLocation()
        }
    }

    fun getLocation(){
        locationManager  = getSystemService(LOCATION_SERVICE) as LocationManager
        if ((ContextCompat.checkSelfPermission(this,android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED)){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),localPermissionGPScode)
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,5000,5f,this)
    }

    override fun onLocationChanged(location: Location) {
       textLatitude = findViewById(R.id.textViewLatitude)
        textLongitude = findViewById(R.id.textViewLogintude)
        textLatitude.text = location.latitude.toString()
        textLongitude.text = location.longitude.toString()

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if (requestCode == localPermissionGPScode){
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this,"GPS permission On",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"GPS permission is denied",Toast.LENGTH_SHORT).show()
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }


}