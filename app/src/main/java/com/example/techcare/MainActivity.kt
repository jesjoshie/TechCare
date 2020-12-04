package com.example.techcare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.loginBtn).setOnClickListener{login()}
        findViewById<Button>(R.id.signupBtn).setOnClickListener{signup()}
    }
    private fun login(){
        val intent = Intent(this, chatbot::class.java)
        startActivity(intent)
    }
    private  fun signup(){
        val intent1 = Intent(this,Signup::class.java)
        startActivity(intent1)

    }
}
