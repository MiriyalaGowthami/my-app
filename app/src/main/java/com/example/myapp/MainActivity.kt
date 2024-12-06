package com.example.myapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    var button: Button? = null
//    var uname: String? = "John Doe"
//    var gmail: String? = "johndoe@example.com"
//    var number: Int? = 1234567890
//    var password: Int? = 123456

    var nameEditText:EditText?=null
    var emailEditText:EditText?=null
    var phoneEditText:EditText?=null
    var passwordEditText:EditText?=null
    var submitButton:Button?=null
    var view: TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         nameEditText = findViewById(R.id.edit_name)
         emailEditText = findViewById(R.id.edit_mail)
         phoneEditText = findViewById(R.id.edit_number)
         passwordEditText = findViewById(R.id.edit_password)
         submitButton = findViewById(R.id.btn)
         view=findViewById(R.id.exd)




        // Handle button click event
        submitButton?.setOnClickListener {

            val enteredName = nameEditText?.text.toString()
            val enteredEmail = emailEditText?.text.toString()
            val enteredPhone = phoneEditText?.text.toString()
            val enteredPassword = passwordEditText?.text.toString()


            if (enteredName.isNotEmpty() && enteredEmail.isNotEmpty() && enteredPhone.isNotEmpty() && enteredPassword.isNotEmpty()) {
                // Login successful
                Toast.makeText(this, "registration successful", Toast.LENGTH_LONG).show()
                Log.d("submit values",""+ enteredName + " "+ enteredEmail)
                view?.text= "$enteredName $enteredEmail"
            } else {
                // Login failed
                Toast.makeText(this, " please fill all details", Toast.LENGTH_LONG).show()
            }


        }
    }
}