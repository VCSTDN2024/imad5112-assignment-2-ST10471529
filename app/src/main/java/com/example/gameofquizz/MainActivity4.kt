package com.example.gameofquizz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class MainActivity4 : AppCompatActivity() {

    private lateinit var exitBtn: Button
    private lateinit var resetBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        exitBtn = findViewById(R.id.exitBtn)
        resetBtn = findViewById(R.id.resetBtn)

        exitBtn.setOnClickListener {
            // Close all activities in the task
            finishAffinity()
            exitProcess(1)
        }

            resetBtn.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }