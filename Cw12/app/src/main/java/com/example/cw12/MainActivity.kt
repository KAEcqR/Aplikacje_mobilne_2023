package com.example.cw12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cw12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind:ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        var znak = true;

        bind.restart.setOnClickListener {
            bind.b1.text = ""
            bind.b2.text = ""
            bind.b3.text = ""
            bind.b4.text = ""
            bind.b5.text = ""
            bind.b6.text = ""
            bind.b7.text = ""
            bind.b8.text = ""
            bind.b9.text = ""
        }

        bind.b1.setOnClickListener {
            if(bind.b1.text == "") {
                if (znak == true){
                    bind.b1.text = "X"
                    znak = false;
                    bind.textView2.text = "";
                } else {
                    bind.b1.text = "O"
                    znak = true;
                    bind.textView2.text = "";
                }
            } else {
                bind.textView2.text = "Pole jest zajęte";
            }
        }

        bind.b2.setOnClickListener {
            if(bind.b2.text == "") {
                if (znak == true){
                    bind.b2.text = "X"
                    znak = false;
                    bind.textView2.text = "";
                } else {
                    bind.b2.text = "O"
                    znak = true;
                    bind.textView2.text = "";
                }
            } else {
                bind.textView2.text = "Pole jest zajęte";
            }
        }

        bind.b3.setOnClickListener {

            if(bind.b3.text == "") {
                if (znak == true){
                    bind.b3.text = "X"
                    znak = false;
                } else {
                    bind.b3.text = "O"
                    znak = true;
                    bind.textView2.text = "";
                }
            } else {
                bind.textView2.text = "Pole jest zajęte";
            }
        }

        bind.b4.setOnClickListener {

            if(bind.b4.text == "") {
                if (znak == true){
                    bind.b4.text = "X"
                    znak = false;
                } else {
                    bind.b4.text = "O"
                    znak = true;
                    bind.textView2.text = "";
                }
            } else {
                bind.textView2.text = "Pole jest zajęte";
            }
        }

        bind.b5.setOnClickListener {

            if(bind.b5.text == "") {
                if (znak == true){
                    bind.b5.text = "X"
                    znak = false;
                    bind.textView2.text = "";
                } else {
                    bind.b5.text = "O"
                    znak = true;
                    bind.textView2.text = "";
                }
            } else {
                bind.textView2.text = "Pole jest zajęte";
            }
        }

        bind.b6.setOnClickListener {

            if(bind.b6.text == "") {
                if (znak == true){
                    bind.b6.text = "X"
                    znak = false;
                    bind.textView2.text = "";
                } else {
                    bind.b6.text = "O"
                    znak = true;
                    bind.textView2.text = "";
                }
            } else {
                bind.textView2.text = "Pole jest zajęte";
            }
        }

        bind.b7.setOnClickListener {

            if(bind.b7.text == "") {
                if (znak == true){
                    bind.b7.text = "X"
                    znak = false;
                    bind.textView2.text = "";
                } else {
                    bind.b7.text = "O"
                    znak = true;
                    bind.textView2.text = "";
                }
            } else {
                bind.textView2.text = "Pole jest zajęte";
            }
        }

        bind.b8.setOnClickListener {

            if(bind.b8.text == "") {
                if (znak == true){
                    bind.b8.text = "X"
                    znak = false;
                    bind.textView2.text = "";
                } else {
                    bind.b8.text = "O"
                    znak = true;
                    bind.textView2.text = "";
                }
            } else {
                bind.textView2.text = "Pole jest zajęte";
            }
        }

        bind.b9.setOnClickListener {

            if(bind.b9.text == "") {
                if (znak == true){
                    bind.b9.text = "X"
                    znak = false;
                    bind.textView2.text = "";
                } else {
                    bind.b9.text = "O"
                    znak = true;
                    bind.textView2.text = "";
                }
            } else {
                bind.textView2.text = "Pole jest zajęte";
            }
        }

    }
}