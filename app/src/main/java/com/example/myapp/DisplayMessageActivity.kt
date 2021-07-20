package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Obtenha o intent que iniciou esta atividade e extraia a string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture o TextView do layout e defina a string como seu texto
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}