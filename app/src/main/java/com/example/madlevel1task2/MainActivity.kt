package com.example.madlevel1task2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.madlevel1task2.databinding.ActivityMainBinding
import java.util.regex.Pattern
import java.util.regex.Pattern.compile


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val t: Pattern = compile("t")
    private val f: Pattern = compile("f")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buttonClick()
    }

    private fun buttonClick() {
        binding.button.setOnClickListener() {
            submit()
        }
    }

    private fun submit() {
        var correctAnswer = 0

        if (binding.Input2.text.matches(t.toRegex())) correctAnswer += 1
        else {
            correctAnswer == correctAnswer
        }
        if (binding.Input3.text.matches(f.toRegex())) correctAnswer += 1
        else {
            correctAnswer == correctAnswer
        }
        if (binding.Input4.text.matches(f.toRegex())) correctAnswer += 1
        else {
            correctAnswer == correctAnswer
        }
        if (binding.Input5.text.matches(f.toRegex())) correctAnswer += 1
        else {
            correctAnswer == correctAnswer
        }

        if (correctAnswer == 0) {
            answerIncorrect()
        } else {
            anwsercorrect(correctAnswer)
        }
    }

    private fun anwsercorrect(correctAnswer: Int) {
        Toast.makeText(this, getString(R.string.correct, correctAnswer), Toast.LENGTH_LONG).show()
    }

    private fun answerIncorrect() {
        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
    }
}