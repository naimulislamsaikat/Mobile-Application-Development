package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BillActivity : AppCompatActivity() {
    lateinit var ic_back8: ImageView
    lateinit var imageView24: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bill)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back8 = findViewById(R.id.ic_back8)
        imageView24 = findViewById(R.id.imageView24)

        ic_back8.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
            finish()
        }
        imageView24.setOnClickListener {
            val intent = Intent(this, PayBillActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}