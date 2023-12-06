package com.example.agrinet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.SearchView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shopButton = findViewById<ConstraintLayout>(R.id.shopButton)
        val profileButton = findViewById<ImageView>(R.id.profileButton)
        val cartButton = findViewById<ImageView>(R.id.cartButton)

        shopButton.setOnClickListener {
            val intent = Intent(this, ShopActivity::class.java)
            startActivity(intent)
        }

        profileButton.setOnClickListener{
            val intent = Intent( this, ProfileActivity::class.java)
            startActivity(intent)
        }

        cartButton.setOnClickListener{
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }

    }
    fun onSearchClicked(view: android.view.View) {
        val searchIntent = Intent(this, SearchActivity::class.java)
        startActivity(searchIntent)
    }

}