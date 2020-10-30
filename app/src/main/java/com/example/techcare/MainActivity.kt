package com.example.techcare

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button2 = findViewById<View>(R.id.button1) as Button


        Button2.setOnClickListener {
            val int1 = Intent(this@MainActivity, Signup::class.java)
            startActivity(int1)
        }
    }
}
