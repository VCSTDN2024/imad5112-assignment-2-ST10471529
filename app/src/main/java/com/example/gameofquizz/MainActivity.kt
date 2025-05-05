package com.example.gameofquizz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Declared the button variable
    private lateinit var startBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Initialized the button variable
        startBtn = findViewById(R.id.startBtn)

        // Set an onClickListener for the button allowing the user to hear the button to indicate its working
        startBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            // Starts the second activity( MainActivity_2.kt)
            startActivity(intent)
        }
    }
}