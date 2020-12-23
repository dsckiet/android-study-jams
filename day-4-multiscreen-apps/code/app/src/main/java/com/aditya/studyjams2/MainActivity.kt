package com.aditya.studyjams2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonInsta: Button = findViewById(R.id.button_instagram)
        val buttonLinkedin: Button = findViewById(R.id.button_linkedin)
        val buttonTwitter: Button = findViewById(R.id.button_twitter)
        buttonInsta.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("social", "instagram")
            startActivity(intent)
        }
        buttonLinkedin.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("social", "linkedin")
            startActivity(intent)
        }
        buttonTwitter.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("social", "twitter")
            startActivity(intent)
        }
    }
    // https://instagram.com/this.is.adiii
    // https://linkedin.com/ydasc815
}