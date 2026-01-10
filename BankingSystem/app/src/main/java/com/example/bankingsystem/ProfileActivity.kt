package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {
    lateinit var ic_back3: ImageView
    lateinit var textView40: EditText
    lateinit var textView41: EditText
    lateinit var textView42: EditText
    lateinit var textView43: EditText
    lateinit var btnSubmit2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back3 = findViewById(R.id.ic_back3)
        textView40 = findViewById(R.id.textView40)
        textView41 = findViewById(R.id.textView41)
        textView42 = findViewById(R.id.textView42)
        textView43 = findViewById(R.id.textView43)
        btnSubmit2 = findViewById(R.id.btnSubmit2)

        ic_back3.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnSubmit2.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}