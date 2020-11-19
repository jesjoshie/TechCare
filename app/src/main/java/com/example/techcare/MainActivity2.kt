package com.example.techcare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity2 : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val drawerlayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navView =findViewById<NavigationView>(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this,drawerlayout, R.string.open,R.string.close)
        drawerlayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {
            when(it.itemId){
            R.id.miItem1 -> Toast.makeText(this,
                "Health Profile",Toast.LENGTH_SHORT).show()
                R.id.miItem2 -> Toast.makeText(this,
                    "Cycle and Ovulation",Toast.LENGTH_SHORT).show()

                R.id.miItem3 -> Toast.makeText(this,
                    "Settings",Toast.LENGTH_SHORT).show()

                R.id.miItem4 -> Toast.makeText(this,
                    "Help",Toast.LENGTH_SHORT).show()

                R.id.miItem5 -> Toast.makeText(this,
                    "About",Toast.LENGTH_SHORT).show()

            }
            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}