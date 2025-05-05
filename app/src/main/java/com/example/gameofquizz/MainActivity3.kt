package com.example.gameofquizz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.color.utilities.Score
import kotlin.system.exitProcess

class MainActivity3 : AppCompatActivity() {

    private lateinit var scoreDisplay: TextView
    private lateinit var messageDisplay: TextView
    private lateinit var reviewBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        // Initialized all the variables for the buttons and text views
        scoreDisplay = findViewById(R.id.scoreDisplay)
        messageDisplay = findViewById(R.id.messageDisplay)
        reviewBtn = findViewById(R.id.reviewBtn)

        // This line of code is used to get the score from the previous activity
        // If score is not found, default to 0 is used
        // $ is used to insert the score into the text view
        val score = intent.getIntExtra("score", 0)
        scoreDisplay.text = " Your score : $score/6"

        // This line of code is used to display a message to the user based on their score
        // If the score is greater than 3, the user will see a congratulatory message
        if (score > 3) {
            messageDisplay.text = "You did good! Congratulations!"
        } else {
            messageDisplay.text = "Keep on trying."
        }

        reviewBtn.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("score", score)
            startActivity(intent)
        }
    }
}