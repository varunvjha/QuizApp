package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

@Suppress("DEPRECATION")
abstract class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val startButton = findViewById<Button>(R.id.btn_start)
        val nameText = findViewById<AppCompatEditText>(R.id.name_text)
        startButton.setOnClickListener {
            if (nameText.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter Your Name",Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}