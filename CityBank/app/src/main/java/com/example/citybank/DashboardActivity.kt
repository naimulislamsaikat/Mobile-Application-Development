package com.example.citybank

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DashboardActivity : AppCompatActivity() {
    lateinit var CardsBtn: Button
    lateinit var AccBtn: Button
    lateinit var backBtn: Button
    lateinit var cardImageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_dashboard)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        CardsBtn = findViewById(R.id.CardsBtn)
        AccBtn = findViewById(R.id.AccBtn)
        backBtn = findViewById(R.id.menuBtn)
        cardImageView = findViewById(R.id.cardImageView)

        CardsBtn.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
        }
        AccBtn.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
        backBtn.setOnClickListener {
            val intent = Intent(this, MoreActivity::class.java)
            startActivity(intent)
        }
        cardImageView.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
        }
    }
}