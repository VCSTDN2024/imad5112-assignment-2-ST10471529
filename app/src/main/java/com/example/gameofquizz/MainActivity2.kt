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

        private val questions = arrayOf(
            "The Earth is round?",
            "In a deck of cards,the king has a moustache?",
            "Volkswagen own's BMW?",
            "In Harry Potter, Draco Malfoy has no siblings?",
            "The Tesla Model S has an engine?",
            "Titanic was released in 1997?",
        )
        private val answers = arrayOf(
            "True",
            "False",
            "False",
            "True",
            "False",
            "True",
        )
        // This line of code is simply keeps track of how many questions you have gone through
       private var currentQuestionIndex = 0
        // This line of code simply keeps track ot the score
       private var score = 0

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

        displayQuestion()

        // This line of code is where i've set the first question and answer to be displayed
        questionDisplay.text = questions[currentQuestionIndex]
        answerDisplay.text = ""

        trueBtn.setOnClickListener {
            checkAnswer("True")
        }
        falseBtn.setOnClickListener {
            checkAnswer("False")
        }
        nextquestionBtn.setOnClickListener {
            nextQuestion()
        }
        resultsBtn.setOnClickListener {
            showResults()
        }
    }

    private fun displayQuestion(){
        questionDisplay.text = questions[currentQuestionIndex]
        answerDisplay.text = ""
    }

    private fun checkAnswer(selectedAnswer: String){
        if (selectedAnswer == answers[currentQuestionIndex]) {
            score++
            answerDisplay.text = "True"
        } else {
            answerDisplay.text = "False"
        }
        trueBtn.isEnabled = false
        falseBtn.isEnabled = false
    }
    private fun nextQuestion(){
        currentQuestionIndex++
        if (currentQuestionIndex < questions.size) {
            displayQuestion()
            trueBtn.isEnabled = true
            falseBtn.isEnabled = true
        } else {
            showResults()
        }
    }

    private fun showResults(){
        val intent = Intent(this, MainActivity3::class.java)
        intent.putExtra("score", score)
        startActivity(intent)
        finish()
    }
}