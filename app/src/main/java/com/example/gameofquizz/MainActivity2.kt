package com.example.gameofquizz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var questionDisplay: TextView
    private lateinit var answerDisplay: TextView
    private lateinit var trueBtn: Button
    private lateinit var falseBtn: Button
    private lateinit var nextquestionBtn: Button
    private lateinit var resultsBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        questionDisplay = findViewById(R.id.questionDisplay)
        answerDisplay = findViewById(R.id.answerDisplay)
        trueBtn = findViewById(R.id.trueBtn)
        falseBtn = findViewById(R.id.falseBtn)
        nextquestionBtn = findViewById(R.id.nextQuestionBtn)
        resultsBtn = findViewById(R.id.resultsBtn)

        val questions = arrayOf(
            "The Earth is round?",
            "In a deck of cards,the king has a moustache?",
            "Volkswagen own's BMW?",
            "In Harry Potter, Draco Malfoy has no siblings?",
            "The Tesla Model S has an engine?",
            "Titanic was released in 1997?",
            "The World Cup Final happened in 2015?",
            "An engine does not need oil to run?",
            "An octopus has three hearts?",
            "The Eiffel Tower is located in Paris?",
        )
        val answers = arrayOf(
            "True",
            "False",
            "False",
            "True",
            "False",
            "True",
            "False",
            "False",
            "True",
            "True",
        )
        // This line of code is simply keeps track of how many questions you have gone through
        var currentQuestionIndex = 0
        // This line of code simply keeps track ot the score
        var score = 0

        // This line of code is where i've set the first question and answer to be displayed
        questionDisplay.text = questions[currentQuestionIndex]
        answerDisplay.text = answers[currentQuestionIndex]

        trueBtn.setOnClickListener {
            if (answers[currentQuestionIndex] == "True") {
                score++
            }
        }
        falseBtn.setOnClickListener {
            if (answers[currentQuestionIndex] == "False") {
                score++
            }
        }
        nextquestionBtn.setOnClickListener {
            currentQuestionIndex++
            if (currentQuestionIndex < questions.size) {
                questionDisplay.text = questions[currentQuestionIndex]
                answerDisplay.text = answers[currentQuestionIndex]
                trueBtn.isEnabled = true
                falseBtn.isEnabled = true
            } else {
                // All questions have been answered, show results
                val intent = Intent(this, MainActivity3::class.java)
            }
            resultsBtn.setOnClickListener {
                val intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
                finish()
            }
        }
    }
}