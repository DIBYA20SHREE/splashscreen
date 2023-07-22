package com.example.final01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class LogIn : AppCompatActivity() {


    private lateinit var databasereference: DatabaseReference
    companion object{
        const val KEY1 ="com.example.final01.SignUp.name"
        const val KEY2 ="com.example.final01.SignUp.mail"
        const val KEY3 ="com.example.final01.SignUp.phone"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val login = findViewById<Button>(R.id.btnFinalLI)
        val phone = findViewById<TextInputEditText>(R.id.etph)
        val password = findViewById<TextInputEditText>(R.id.etpassword)

        login.setOnClickListener{
            // take reference till node users

            val uniqueId = phone.text.toString()
            val password= password.text.toString()
            if(uniqueId.isNotEmpty()&& password.isNotEmpty()){
                readData(uniqueId)
                readData(password)
            }else{
                Toast.makeText(this, "Please enter phone number", Toast.LENGTH_SHORT).show()
            }
        }
    }//onCreate method over
    private fun readData(uniqueId : String){
        databasereference = FirebaseDatabase.getInstance().getReference("users")

        databasereference.child(uniqueId).get().addOnSuccessListener {

            if(it.exists()){
                //welcome user in your app with intents and also pass
                val name= it.child("name").value
                val mail=it.child("mail").value
                val phone= it.child("phone").value

                val home= Intent(this, Home::class.java)
                home.putExtra(KEY1, name.toString())
                home.putExtra(KEY2, mail.toString())
                home.putExtra(KEY3, phone.toString())
                startActivity(home)

            }else{
                Toast.makeText(this,"User does not exist, please first sign up", Toast.LENGTH_SHORT).show()
            }

        }.addOnFailureListener{
            Toast.makeText(this,"Failed, error in DataBase", Toast.LENGTH_SHORT).show()
        }
    }

}