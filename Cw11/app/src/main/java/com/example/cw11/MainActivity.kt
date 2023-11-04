package com.example.cw11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.cw11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind:ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        val priorityList = arrayListOf<Priority>(
            Priority.LOW,
            Priority.MID,
            Priority.HIGH,
            Priority.NOW,
        )
        val priorityAdapter = ArrayAdapter<Priority>(this, android.R.layout.simple_spinner_item, priorityList)
        priorityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        bind.spinner.adapter = priorityAdapter

        val myTodos = arrayListOf<Todo>(Todo("Wtań z łóżka", Priority.NOW))
        val listAdapter = ArrayAdapter<Todo>(this, android.R.layout.simple_list_item_1, myTodos)
        bind.lvtodos.adapter = listAdapter;

        bind.btnAdd.setOnClickListener {
            val itemContent = bind.ed1.text.toString().trim()
            val priority = bind.spinner.selectedItem as Priority;
            myTodos.add(Todo(itemContent, priority))
            listAdapter.notifyDataSetChanged()
            bind.ed1.setText("");

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