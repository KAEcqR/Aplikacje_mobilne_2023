package com.example.cw10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.cw10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind:ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        val myTodos = arrayListOf<String>("Wstac rano", "umyc sie", "zjesc")
        val listAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myTodos)
        bind.lvtodos.adapter = listAdapter;

        bind.btnAdd.setOnClickListener {
            val item = bind.ed1.text.toString().trim()
            if(item.isEmpty()) return@setOnClickListener
            myTodos.add(item)
            listAdapter.notifyDataSetChanged()
            bind.ed1.setText("");
            // Toast.makeText(this@MainActivity, "moje elementy: ${myTodos.count()}",Toast.LENGTH_SHORT).show()

        }
        // Set an item click listener for the ListView
        bind.lvtodos.setOnItemClickListener { parent, view, position, id ->
            val clickedIndex = position
            val clickedItem = myTodos[position]
            Toast.makeText(this, "Usunięto zadanie : $clickedItem", Toast.LENGTH_SHORT).show()
            val index = clickedIndex.toInt();
            myTodos.removeAt(index)
            listAdapter.notifyDataSetChanged()
        }
    }
}