package com.example.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var progressBar: ProgressBar? = null
    private var progressTextView: TextView? = null
    private var questionTextView: TextView? = null
    private var questionImageView: ImageView? = null
    private var optionOneTextView: TextView? = null
    private var optionTwoTextView: TextView? = null
    private var optionThreeTextView: TextView? = null
    private var optionFourTextView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        mQuestionsList = Constants.getQuestions()
        progressBar = findViewById(R.id.progressbar_horizontal)
        progressTextView = findViewById(R.id.progress_text)
        questionTextView = findViewById(R.id.question_text)
        questionImageView = findViewById(R.id.question_image)
        optionOneTextView = findViewById(R.id.option_one)
        optionTwoTextView = findViewById(R.id.option_two)
        optionThreeTextView = findViewById(R.id.option_three)
        optionFourTextView = findViewById(R.id.option_four)
        setQuestion()

        optionOneTextView!!.setOnClickListener(this)
        optionTwoTextView!!.setOnClickListener(this)
        optionThreeTextView!!.setOnClickListener(this)
        optionFourTextView!!.setOnClickListener(this)
    }
    private fun setQuestion(){
        val mCurrentPosition = 1
        val question = mQuestionsList!![mCurrentPosition-1]
        defaultOptionsView()

        progressBar!!.progress = mCurrentPosition
        progressTextView!!.text = "$mCurrentPosition" + "/" + progressBar!!.max
        questionTextView!!.text = question!!.question
        questionImageView!!.setImageResource(question.image)

        optionOneTextView!!.text = question.optionOne
        optionTwoTextView!!.text = question.optionTwo
        optionThreeTextView!!.text = question.optionThree
        optionFourTextView!!.text = question.optionFour
    }
    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0,optionOneTextView!!)
        options.add(1,optionTwoTextView!!)
        options.add(2,optionThreeTextView!!)
        options.add(3,optionFourTextView!!)
        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.default_option_border_bg
            )

        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.option_one ->{
                selectedOptionView(optionOneTextView!!,1)
            }
            R.id.option_two ->{
                selectedOptionView(optionTwoTextView!!,2)
            }
            R.id.option_three ->{
                selectedOptionView(optionThreeTextView!!,3)
            }
            R.id.option_four ->{
                selectedOptionView(optionFourTextView!!,4)
            }
        }
    }

    private fun selectedOptionView(tv:TextView, selectedOptionNumber:Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNumber
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
                this,
                R.drawable.selected_option_border_bg
        )
    }


}