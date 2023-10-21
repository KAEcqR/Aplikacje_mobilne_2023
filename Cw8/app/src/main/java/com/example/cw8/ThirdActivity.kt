package com.example.cw8

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val liczba = findViewById<EditText>(R.id.liczba)
        val liczba2 = findViewById<EditText>(R.id.liczba2)
        val wynikTextView = findViewById<TextView>(R.id.wynik2)
        val przyciskPolicz = findViewById<Button>(R.id.policz)

        przyciskPolicz.setOnClickListener {
            val wprowadzonaLiczba = liczba.text.toString()
            val wprowadzonaLiczba2 = liczba2.text.toString()

            try {
                val liczbaInt = wprowadzonaLiczba.toInt()
                val liczba2Int = wprowadzonaLiczba2.toInt()

                fun obliczNWD(a: Int, b: Int): Int {
                    return if (b == 0) a else obliczNWD(b, a % b)
                }

                val nwd = obliczNWD(liczbaInt, liczba2Int)

                wynikTextView.text = "Wynik to: $nwd"
            } catch (e: NumberFormatException) {
                wynikTextView.text = "Nieprawidłowa liczba"
            }
        }
    }
}