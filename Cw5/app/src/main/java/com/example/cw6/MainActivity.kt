package com.example.cw6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

private var _counter:Int = 1;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val info = findViewById<TextView>(R.id.textView)
        val Counter = findViewById<TextView>(R.id.textView2)

        button.setOnClickListener {

            _counter = _counter + 1;
            Counter.textSize= (_counter * 4 + 20).toFloat()
            if(_counter > 10) {
                _counter = 1
                Counter.textSize= 24.toFloat()
            }
            Counter.text = _counter.toString()
        }
    }
}