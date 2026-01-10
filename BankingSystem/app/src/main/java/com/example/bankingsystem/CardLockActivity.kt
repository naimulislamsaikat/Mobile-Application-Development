package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CardLockActivity : AppCompatActivity() {
    lateinit var ic_back70: ImageView
    lateinit var btnSub: Button
    lateinit var canBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_card_lock)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back70 = findViewById(R.id.ic_back70)
        btnSub = findViewById(R.id.btnSub)
        canBtn = findViewById(R.id.canBtn)

        ic_back70.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnSub.setOnClickListener{
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
            finish()
        }
        canBtn.setOnClickListener{
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}