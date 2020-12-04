package com.example.techcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        findViewById<Button>(R.id.imageButton2).setOnClickListener{createacc()}
    }
    private fun createacc(){
        val intent = Intent(this, chatbot::class.java)
        startActivity(intent)
    }
}