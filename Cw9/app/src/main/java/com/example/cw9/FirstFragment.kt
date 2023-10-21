package com.example.cw9

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etA = view.findViewById<EditText>(R.id.etA)
        val etB = view.findViewById<EditText>(R.id.etB)
        val dodawanie = view.findViewById<Button>(R.id.dodawanie)
        val nwd = view.findViewById<Button>(R.id.odejmowanie)
        val wynik = view.findViewById<TextView>(R.id.wynik)

        dodawanie.setOnClickListener {
            // Get the values from the EditText fields
            val a = etA.text.toString().toIntOrNull() ?: 0
            val b = etB.text.toString().toIntOrNull() ?: 0

            // Calculate the sum
            val sum = a + b

            // Display the result in the "wynik" TextView
            wynik.text = "Wynik: $sum"
        }

        nwd.setOnClickListener {
            // Get the values from the EditText fields
            val a = etA.text.toString().toIntOrNull() ?: 0
            val b = etB.text.toString().toIntOrNull() ?: 0

            // Calculate the subtraction
            val difference = a - b

            // Display the result in the "wynik" TextView
            wynik.text = "Wynik: $difference"
        }
    }
}
