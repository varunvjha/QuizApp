package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private val progressBar = findViewById<ProgressBar>(R.id.progressbar_horizontal)
    private val progressTextView = findViewById<TextView>(R.id.progress_text)
    private val questionTextView = findViewById<TextView>(R.id.question_text)
    private val questionImageView = findViewById<ImageView>(R.id.question_image)
    private val optionOneTextView = findViewById<TextView>(R.id.option_one)
    private val optionTwoTextView = findViewById<TextView>(R.id.option_two)
    private val optionThreeTextView = findViewById<TextView>(R.id.option_three)
    private val optionFourTextView = findViewById<TextView>(R.id.option_four)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        mQuestionsList = Constants.getQuestions()
        setQuestion()
    }
    private fun setQuestion(){
        val mCurrentPosition = 1
        val question = mQuestionsList!![mCurrentPosition-1]
        progressBar.progress = mCurrentPosition
        progressTextView.text = "$mCurrentPosition" + "/" + progressBar.max
        questionTextView.text = question!!.question
        questionImageView.setImageResource(question.image)
        optionOneTextView.text = question.optionOne
        optionTwoTextView.text = question.optionTwo
        optionThreeTextView.text = question.optionThree
        optionFourTextView.text = question.optionFour
    }



}