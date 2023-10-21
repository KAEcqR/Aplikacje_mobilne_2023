package com.example.cw9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.cw9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind:ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)


        bind.Frag1.setOnClickListener { replaceFragment(FirstFragment()) }
        bind.Frag2.setOnClickListener { replaceFragment(SecondFragment()) }
    }
    private fun replaceFragment(fragment:Fragment){
        val fragmentManager = supportFragmentManager
        val fragTransaction = fragmentManager.beginTransaction()
        fragTransaction.replace(R.id.fragments,fragment)
        fragTransaction.commit()
    }

}