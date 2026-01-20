package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AccountActivity : AppCompatActivity() {
    lateinit var ic_back5: ImageView
    lateinit var transferBtn: Button
    lateinit var infoBtn: Button
    lateinit var reqBtn: Button
    lateinit var statusBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_account)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back5 = findViewById(R.id.ic_back5)
        infoBtn = findViewById(R.id.infoBtn)
        transferBtn = findViewById(R.id.transferBtn)
        reqBtn = findViewById(R.id.reqBtn)
        statusBtn = findViewById(R.id.statusBtn)


        ic_back5.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        infoBtn.setOnClickListener {
            val intent = Intent(this, SavedAccountActivity::class.java)
            startActivity(intent)
            finish()
        }
        transferBtn.setOnClickListener {
            val intent = Intent(this, BankTransferActivity::class.java)
            startActivity(intent)
            finish()
        }
        statusBtn.setOnClickListener {
            val intent = Intent(this, SuccessActivity::class.java)
            startActivity(intent)
            finish()
        }
        reqBtn.setOnClickListener {
            val intent = Intent(this, SuccessActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}