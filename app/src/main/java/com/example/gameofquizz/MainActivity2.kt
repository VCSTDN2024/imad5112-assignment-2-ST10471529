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

    // These are the questions and answers that will be displayed to the user
        private val questions = arrayOf(
            "The Earth is round?",
            "In a deck of cards,the king has a moustache?",
            "Volkswagen own's BMW?",
            "In Harry Potter, Draco Malfoy has no siblings?",
            "The Tesla Model S has an engine?",
            "Titanic was released in 1997?",
        )
    // These are the answers to the questions
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

        // Initialized all the variables for the buttons and text views
        questionDisplay = findViewById(R.id.questionDisplay)
        answerDisplay = findViewById(R.id.answerDisplay)
        trueBtn = findViewById(R.id.trueBtn)
        falseBtn = findViewById(R.id.falseBtn)
        nextquestionBtn = findViewById(R.id.nextQuestionBtn)

        // Displays the first question when the activity is created
        displayQuestion()

        // This line of code is where i've set the first question and answer to be displayed
        questionDisplay.text = questions[currentQuestionIndex]
        answerDisplay.text = ""

        trueBtn.setOnClickListener {
            // This line of code checks the answer when the user clicks the true button
            checkAnswer("True")
        }
        falseBtn.setOnClickListener {
            // If the answer is false then the score will be incremented
            checkAnswer("False")
        }
        nextquestionBtn.setOnClickListener {
            nextQuestion()
        }
    }
    // Displays the question and answer
    private fun displayQuestion(){
        questionDisplay.text = questions[currentQuestionIndex]
        answerDisplay.text = ""
    }
    // Checks the answer and updates the score
    // Ive used a if statement to check if the answer is correct or incorrect
    // The string selectedAnswer is used to compare the answer to the correct answer
    private fun checkAnswer(selectedAnswer: String){
        if (selectedAnswer == answers[currentQuestionIndex]) {
            score++
            answerDisplay.text = "Correct"
        } else {
            answerDisplay.text = "Incorrect"
        }
        trueBtn.isEnabled = false
        falseBtn.isEnabled = false
    }
    private fun nextQuestion(){
        // This line of code is used to increment the current question index
        // This is used to display the next question
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
        // This line of code is used to pass the score to the next activity
        startActivity(intent)
        finish()
    }
}