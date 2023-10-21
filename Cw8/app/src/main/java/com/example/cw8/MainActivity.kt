package com.example.cw8

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.liczenie);
        val btn2 = findViewById<Button>(R.id.nwd);

        btn1.setOnClickListener {
            Toast.makeText(this@MainActivity, "liczonko", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java);
            startActivity(intent);
        }
        btn2.setOnClickListener {
            Toast.makeText(this@MainActivity, "NWD", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ThirdActivity::class.java);
            startActivity(intent);
        }
    }
}