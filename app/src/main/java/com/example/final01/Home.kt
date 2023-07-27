package com.example.final01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val name = intent.getStringArrayExtra(LogIn.KEY1)
        val mail = intent.getStringArrayExtra(LogIn.KEY2)
        val phone = intent.getStringArrayExtra(LogIn.KEY3)

        val home = findViewById<TextView>(R.id.txtHome)
        home.text = "Welcome$name"


    }
}