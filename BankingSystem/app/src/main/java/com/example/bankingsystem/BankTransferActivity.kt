package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BankTransferActivity : AppCompatActivity() {
    lateinit var ic_back6: ImageView
    lateinit var imageButton: ImageButton
    lateinit var imageButton2: ImageButton
    lateinit var imageButton3: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bank_transfer)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back6 = findViewById(R.id.ic_back6)
        imageButton = findViewById(R.id.imageButton)
        imageButton2 = findViewById(R.id.imageButton2)
        imageButton3 = findViewById(R.id.imageButton3)

        ic_back6.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
            finish()
        }
        imageButton.setOnClickListener {
            val intent = Intent(this, SuccessActivity::class.java)
            startActivity(intent)
            finish()
        }
        imageButton2.setOnClickListener {
            val intent = Intent(this, SuccessActivity::class.java)
            startActivity(intent)
            finish()
        }
        imageButton3.setOnClickListener {
            val intent = Intent(this, SuccessActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}