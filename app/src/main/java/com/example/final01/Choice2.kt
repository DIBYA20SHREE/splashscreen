package com.example.final01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Choice2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice2)

        val btn= findViewById<Button>(R.id.edtchoicenext)

        btn.setOnClickListener {
            intent= Intent(applicationContext, EditResume2::class.java)
            startActivity(intent)
        }
    }
}