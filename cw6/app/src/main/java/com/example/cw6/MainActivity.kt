package com.example.cw6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = findViewById<EditText>(R.id.etA)
        val b = findViewById<EditText>(R.id.etB)
        val buttonDod = findViewById<Button>(R.id.dodawanie)
        val buttonOde = findViewById<Button>(R.id.odejmowanie)
        val buttonDzi = findViewById<Button>(R.id.dzielenie)
        val buttonMno = findViewById<Button>(R.id.mnozenie)
        var wynik = findViewById<TextView>(R.id.wynik)

        buttonDod.setOnClickListener {
            val a:Double = a.text.toString().toDouble()
            val b:Double = b.text.toString().toDouble()
            val output = (a + b).toString()
            wynik.text = "$a + $b = $output"
        }
        buttonOde.setOnClickListener {
            val a:Double = a.text.toString().toDouble()
            val b:Double = b.text.toString().toDouble()
            val output = (a - b).toString()
            wynik.text = "$a - $b = $output"
        }
        buttonMno.setOnClickListener {
            val a:Double = a.text.toString().toDouble()
            val b:Double = b.text.toString().toDouble()
            val output = (a * b).toString()
            wynik.text = "$a * $b = $output"
        }
        buttonDzi.setOnClickListener {
            val a:Double = a.text.toString().toDouble()
            val b:Double = b.text.toString().toDouble()
            val output = (a / b).toString()
            wynik.text = "$a / $b = $output"
        }
    }
}