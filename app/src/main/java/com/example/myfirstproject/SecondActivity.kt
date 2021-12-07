package com.example.myfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {

    lateinit var textRandom: TextView
    private val KEY = "hello"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textRandom = findViewById(R.id.text_hello)
        var clickHere:Button = findViewById(R.id.click_here_button)

        clickHere.setOnClickListener{
            randomize()
        }

        var intent_main : String? = intent.extras?.getString(KEY, "Hello bro!")
        textRandom.text = intent_main

    }

    fun randomize() {
        textRandom.text = Random.nextInt().toString()
    }
}




