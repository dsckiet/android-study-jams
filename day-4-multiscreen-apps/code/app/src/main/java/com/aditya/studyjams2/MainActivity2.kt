package com.aditya.studyjams2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val handleName: EditText = findViewById(R.id.handle_name)
        val openProfile: Button = findViewById(R.id.open_profile)
        val socialProfileKey = intent.getStringExtra("social")
        var url = when(socialProfileKey) {
            "instagram" -> {
                "https://www.instagram.com/"
            }
            "linkedin" -> {
                "https://www.linkedin.com/in/"
            }
            "twitter" -> {
                "https://twitter.com/"
            }
            else -> ""
        }
        openProfile.setOnClickListener {
            val s = handleName.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url + s))
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}