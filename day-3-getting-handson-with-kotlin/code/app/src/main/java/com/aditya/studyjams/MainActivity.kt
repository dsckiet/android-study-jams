package com.aditya.studyjams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val editText: EditText = findViewById(R.id.edit_text)
        val textView: TextView = findViewById(R.id.textView)
        button.setOnClickListener {
            // Toast.makeText(this, editText.text.toString(), Toast.LENGTH_LONG).show()
            val s: String = editText.text.toString()
            textView.setText("Happy Birthday $s")
        }
    }
}