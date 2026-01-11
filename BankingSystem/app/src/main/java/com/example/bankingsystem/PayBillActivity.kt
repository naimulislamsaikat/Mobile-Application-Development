package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PayBillActivity : AppCompatActivity() {
    lateinit var ic_back9: ImageView
    lateinit var imageView22: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pay_bill)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back9 = findViewById(R.id.ic_back9)
        imageView22 = findViewById(R.id.imageView22)

        ic_back9.setOnClickListener {
            val intent = Intent(this, BillActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}