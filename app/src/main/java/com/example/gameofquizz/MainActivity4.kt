package com.example.gameofquizz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.color.utilities.Score
import kotlin.system.exitProcess

class MainActivity4 : AppCompatActivity() {

    // Declaring variables for the buttons which restart and exit the quiz
    private lateinit var restartBtn: Button
    private lateinit var exitBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        // Initializing the buttons variables
        restartBtn = findViewById(R.id.restartBtn)
        exitBtn = findViewById(R.id.exitBtn)

        // Setting the onClickListener for the restart button
        // This line of code takes the user back to the MainActivity2 to redo the quizz
        restartBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            }
        // Setting the onClickListener for the exit button
        // CLose all activites in the app and exit the app
        exitBtn.setOnClickListener {
            finishAffinity()
            // Forces the app to close with no delays
            exitProcess(0)
        }
    }
}