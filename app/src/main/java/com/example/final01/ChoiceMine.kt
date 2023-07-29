package com.example.final01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChoiceMine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice_mine)

        val btn= findViewById<Button>(R.id.edtchoice1)

        btn.setOnClickListener {

            intent= Intent(applicationContext, EditResume1::class.java)
            startActivity(intent)
        }

    }
}