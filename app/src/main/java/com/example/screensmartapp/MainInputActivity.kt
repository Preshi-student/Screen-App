package com.example.screensmartapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.time.MonthDay

class MainInputActivity : AppCompatActivity() {
    private lateinit var inputDay: EditText
    private lateinit var inputMinTemp: EditText
    private lateinit var inputMaxTemp: EditText
    private lateinit var inputCondition: EditText
    private lateinit var addEntry: Button
    private lateinit var detailsBtn: Button
    private lateinit var clearData: Button
    private lateinit var avgTemp: TextView









    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_input)

        // Input UI Elements here
        inputDay = findViewById(R.id.inputDay)
        inputMinTemp = findViewById(R.id.inputMinTemp)
        inputMaxTemp = findViewById(R.id.inputMaxTemp)
        inputCondition = findViewById(R.id.inputCondition)
        addEntry = findViewById(R.id.addEntry)
        detailsBtn = findViewById(R.id.detailsBtn)
        clearData = findViewById(R.id.clearData)
        avgTemp = findViewById(R.id.avgTemp)

        // Set Add Entry button on click listener
        addEntry.setOnClickListener{
            val day = inputDay.text.toString().trim()
            val minTemp = inputMinTemp.text.toString().toIntOrNull()
            val maxTemp = inputMaxTemp.text.toString().toIntOrNull()
            val condition = inputCondition.text.toString().trim()






            if (minTemp !=null && maxTemp !=null ) {
                val success = WeatherManager.weatherEntry(day, minTemp, maxTemp, condition)
                if (success) {
                    Toast.makeText(
                        this,
                        "Invalid input, please check the values.",
                        Toast.LENGTH_SHORT
                    ).show()


                } else {
                    Toast.makeText(
                        this,
                        "Temperature values must be valid numbers.",
                        Toast.LENGTH_SHORT
                    ).show()
                }



            }
            // Set the View Details button on click listener
            detailsBtn.setOnClickListener{
                val intent = Intent(this, MainInputActivity::class.java)
                startActivity(intent) // This will start the new screen
            }


            }

        }
    }





