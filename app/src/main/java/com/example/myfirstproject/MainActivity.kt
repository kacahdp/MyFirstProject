package com.example.myfirstproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.net.URI
import kotlin.random.Random
import kotlin.random.nextInt

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button
    val KEY = "hello"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityButton = findViewById(R.id.next_activity_button)

        nextActivityButton.setOnClickListener {
            val secondActivityIntent: Intent = Intent(this, SecondActivity::class.java)
            secondActivityIntent.putExtra(KEY, "HEllo from Main Activity")
            startActivity(secondActivityIntent)
        }

        var toLink: Button = findViewById(R.id.ToLink)

        toLink.setOnClickListener {
            var phoneNumber = Uri.parse("https://google.com")
            var openPhoneIntent: Intent = Intent(Intent.ACTION_VIEW, phoneNumber)
            var chooser = Intent.createChooser(openPhoneIntent, "phone")
            startActivity(chooser)
        }

    }


}