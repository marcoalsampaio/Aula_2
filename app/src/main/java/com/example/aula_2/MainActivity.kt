package com.example.aula_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Life cycle: onCreate")

        Toast.makeText(this, R.string.hello, Toast.LENGTH_LONG).show() //Aceder pelo Resources
        //Manter strings no ficheiros das strings e usar as keys
    }

    override fun onStart() {
        super.onStart()
        println("Life cycle: onStart")
    }

    override fun onResume() {
        super.onResume()
        println("Life cycle: onResume")
    }

    override fun onPause() {
        super.onPause()
        println("Life cycle: onPause")
    }

    override fun onRestart() {
        super.onRestart()
        println("Life cycle: onRestart")
    }

    override fun onStop() {
        super.onStop()
        println("Life cycle: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Life cycle: onDestroy")
    }

    //Multi Lingua
}