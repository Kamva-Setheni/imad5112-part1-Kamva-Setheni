package com.example.historicalfigurelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




            //Constant variable for minimum and maximum age
            val minValidAge: Int = 20
            val maxValidAge: Int = 100

            //Declare variables for UI elements
            val inputAgeField: EditText = findViewById(R.id.inputAgeField)
            val resultTextView: TextView = findViewById(R.id.resultTextView)
            val generateButton: Button = findViewById(R.id.generateButton)
            val clearButton: Button = findViewById(R.id.clearButton)

            clearButton?.setOnClickListener {
                inputAgeField.text.clear()
                resultTextView.text = ""
            }

            generateButton?.setOnClickListener {
                var generated = inputAgeField.text.toString().toIntOrNull()

                if (generated==null){
                    resultTextView.text="Error please enter whole number"
                }else if (generated == 30) {
                    resultTextView.text = "Steve Biko Anti-Apartheid activist"
                } else if (generated == 74) {
                    resultTextView.text = "Muhammad Ali Boxing legend"
                } else if (generated == 57) {
                    resultTextView.text = "Mansa Musa Richest man in history"
                } else if (generated == 45) {
                    resultTextView.text = "Freddie Mercury Music legend and lead singer for Queen"
                } else if (generated == 65) {
                    resultTextView.text = "Genghis Khan Greatest general in history"
                } else if (generated == 81) {
                    resultTextView.text = "Sixto (Sugarman) Rodriguez Forgotten music legend"
                } else if (generated == 99) {
                    resultTextView.text = "Prince Philip Could'nt Keep it 100"
                } else if (generated == 24) {
                    resultTextView.text = "The Notorious B.I.G Hip Hop legend who was murdered "
                } else if (generated == 39) {
                    resultTextView.text =
                        "Brenda Fassie MaBrrr singer songwritter, dancer, activist"
                } else if (generated == 48) {
                    resultTextView.text = "Whitney Houston Famous singer who was known " +
                            "for her vocal range"
                } else if (generated <= 20) {
                    resultTextView.text = "Error number is out of age range"
                } else if (generated >= 100) {
                    resultTextView.text = "Error number is out of age range"

                } else resultTextView.text = "Error no figure matched"


            }




        }

    }











