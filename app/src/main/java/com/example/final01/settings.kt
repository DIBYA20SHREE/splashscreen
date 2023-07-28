package com.example.final01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)


        val name = intent.getStringExtra(LogIn.KEY1)
        val mail = intent.getStringExtra(LogIn.KEY2)
        val phone = intent.getStringExtra(LogIn.KEY3)

        val stng = findViewById<TextView>(R.id.stname)
        val stemail= findViewById<TextView>(R.id.stemail)
        val stphone= findViewById<TextView>(R.id.stphone)

        stng.text = "Name: $name"
        stemail.text = "Email: $mail"
        stphone.text = "Ph. No.: $phone"
    }
}