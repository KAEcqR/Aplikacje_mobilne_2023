package com.example.cw9

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etA = view.findViewById<EditText>(R.id.etA)
        val etB = view.findViewById<EditText>(R.id.etB)
        val nwdButton = view.findViewById<Button>(R.id.nwd)
        val wynik = view.findViewById<TextView>(R.id.wynik)

        nwdButton.setOnClickListener {
            val b = etB.text.toString().toIntOrNull() ?: 0
            val a = etA.text.toString().toIntOrNull() ?: 0

            val nwd = calculateNWD(a, b)

            wynik.text = "NWD: $nwd"
        }
    }

    private fun calculateNWD(a: Int, b: Int): Int {
        var x = a
        var y = b
        while (y != 0) {
            val temp = y
            y = x % y
            x = temp
        }
        return x
    }
}