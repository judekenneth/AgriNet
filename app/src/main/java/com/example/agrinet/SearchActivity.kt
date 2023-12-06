package com.example.agrinet

import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SearchActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchAdapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.searchactivity)
        

        val editTextSearch = findViewById<EditText>(R.id.editTextSearch)
        val buttonSearch = findViewById<Button>(R.id.buttonSearch)

        buttonSearch.setOnClickListener {
            val searchQuery = editTextSearch.text.toString().trim()

            if (searchQuery.isNotEmpty()) {
                performSearch(searchQuery)
            } else {
                showToast("Please enter a search query")
            }
        }
    }

    private fun performSearch(query: String) {
        // TODO: Implement your search logic here
        // For example, you can display search results in a list, update a RecyclerView, or navigate to another activity
        showToast("Searching for: $query")
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
