package com.example.screensmartapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
private lateinit var nameTxt: TextView
private lateinit var myNameTxt: TextView
private lateinit var studnTxt: TextView
private lateinit var clearBtn: Button
private lateinit var nextBtn: Button
private lateinit var exitBtn: Button

override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Input UI Elements here
    nameTxt = findViewById(R.id.nameTxt)
    myNameTxt = findViewById(R.id.myNameTxt)
    studnTxt = findViewById(R.id.studnTxt)
    clearBtn = findViewById(R.id.clearBtn)
    nextBtn = findViewById(R.id.nextBtn)
    exitBtn = findViewById(R.id.exitBtn)

    // Set the clear button on click listener
    clearBtn.setOnClickListener{
        // Clear the text in each TextView
        nameTxt.text = ""
        myNameTxt.text = ""
        studnTxt.text = ""







    }
    // Set the next button on click listener
    nextBtn.setOnClickListener{
    val intent = Intent(this,MainInputActivity::class.java)
        startActivity(intent) // This will start the next screen
    }

    // Set the exit button on click listener
    exitBtn.setOnClickListener{
        finishAffinity()
    }










    }
}