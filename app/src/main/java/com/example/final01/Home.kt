package com.example.final01

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val name = intent.getStringExtra(LogIn.KEY1)


        val btnhome= findViewById<Button>(R.id.btnHome)

        btnhome.setOnClickListener {
            intent= Intent(applicationContext, ResumeSelect::class.java)
            startActivity(intent)
        }



        val home = findViewById<TextView>(R.id.txtHome)
        home.text = "Welcome $name"




    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.omenu, menu)

        return super.onCreateOptionsMenu(menu)

    }

    // Home.kt

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val name = intent.getStringExtra(LogIn.KEY1)
        val mail = intent.getStringExtra(LogIn.KEY2)
        val phone = intent.getStringExtra(LogIn.KEY3)



        when (item.itemId) {
            R.id.settings -> {
                val intent = Intent(applicationContext, settings::class.java)
                intent.putExtra(LogIn.KEY1, name)   // Pass the name
                intent.putExtra(LogIn.KEY2, mail)   // Pass the mail
                intent.putExtra(LogIn.KEY3, phone)  // Pass the phone
                startActivity(intent)
                return true
            }
            // Add other cases for other menu items if needed
        }
        return super.onOptionsItemSelected(item)
    }



}

