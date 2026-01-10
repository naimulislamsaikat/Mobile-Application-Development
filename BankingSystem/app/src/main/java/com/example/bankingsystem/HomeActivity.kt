package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    lateinit var ic_back: ImageView
    lateinit var ic_menu: ImageView
    lateinit var tab_cards: TextView
    lateinit var textView47: TextView
    lateinit var textView48: TextView
    lateinit var textView49: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back = findViewById(R.id.ic_back)
        ic_menu = findViewById(R.id.ic_menu)
        tab_cards = findViewById(R.id.tab_cards)

        ic_back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        ic_menu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        tab_cards.setOnClickListener {
            val intent = Intent(this, HomeActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}