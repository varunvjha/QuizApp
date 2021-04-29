package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

@Suppress("DEPRECATION")
class ResultActivity : AppCompatActivity() {
    private var nameTextView: TextView? = null
    private var scoreTextView: TextView? = null
    private var finishButton: Button? = null
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val username = intent.getStringExtra(Constants.USER_NAME)
        nameTextView = findViewById(R.id.name_tv)
        nameTextView!!.text = username
        scoreTextView = findViewById(R.id.score_text)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        scoreTextView!!.text = "Your Score is $correctAnswers out of $totalQuestions"
        finishButton = findViewById(R.id.finish_button)
        finishButton!!.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}