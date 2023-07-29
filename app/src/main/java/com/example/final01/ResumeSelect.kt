package com.example.final01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class ResumeSelect : AppCompatActivity() {

    private var currentImage = 0
    private lateinit var image: ImageView
    private var names = arrayOf("Resume 1", "Resume 2")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resume_select)

        supportActionBar?.hide()

        val prev = findViewById<ImageButton>(R.id.Idback)
        val next = findViewById<ImageButton>(R.id.Idnext)
        val text = findViewById<TextView>(R.id.textViewResume)

        val pic1= findViewById<ImageView>(R.id.resume0)
        val pic2= findViewById<ImageView>(R.id.resume1)

        pic1.setOnClickListener{
            intent = Intent(applicationContext, ChoiceMine::class.java)
            startActivity(intent)
        }

        pic2.setOnClickListener{
            intent= Intent(applicationContext, Choice2::class.java)
            startActivity(intent)
        }

        prev.setOnClickListener{
            val idCurrentImageString = "resume$currentImage"

            //convert string id into address associated with it

            val idCurrentImageInt= this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha= 0f

            currentImage = (2 + currentImage-1)%2

            val idImageToShowString = "resume$currentImage"
            // convert string id into address with it

            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString,"id", packageName)

            image = findViewById(idImageToShowInt)
            image.alpha= 1f
            text.text = names[currentImage]

        }

        next.setOnClickListener {
            val idCurrentImageString = "resume$currentImage"
            // convert string id into integer address associated with it


            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha= 0f

            currentImage = (2+ currentImage+1)%2
            val idImageToShowString = "resume$currentImage"

            // convert string id into integer address associated with it
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha= 1f
            text.text = names[currentImage]
        }

    }

}