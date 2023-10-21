package com.example.cw9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cw9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind:ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("Elo")
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btnInfo.setOnClickListener {
            val info = bind.edInfo.text.toString().trim()
            val text_info = bind.tvInfo
            if(!info.isEmpty()){
                text_info.text = info
            } else {
                text_info.text = "Napisz cos gamoniu"

            }
        }

    }


}