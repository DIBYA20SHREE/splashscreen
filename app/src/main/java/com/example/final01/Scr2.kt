package com.example.final01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Scr2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scr2)
        val logInbtn= findViewById<Button>(R.id.btnLogin)
        val signUpbtn= findViewById<Button>(R.id.btnSignup)

        logInbtn.setOnClickListener{
            intent= Intent(applicationContext, LogIn::class.java)
            startActivity(intent)
        }

        signUpbtn.setOnClickListener{
            intent= Intent(applicationContext, SignUp::class.java)
            startActivity(intent)
        }


    }
}