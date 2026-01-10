package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var etUserId: EditText
    lateinit var etPassword: EditText
    lateinit var checkRemember: CheckBox
    lateinit var tvForgot: TextView
    lateinit var btnLogin: Button
    lateinit var btnLogin2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        etUserId = findViewById(R.id.etUserId)
        etPassword = findViewById(R.id.etPassword)
        checkRemember = findViewById(R.id.checkRemember)
        tvForgot = findViewById(R.id.tvForgot)
        btnLogin = findViewById(R.id.btnLogin)
        btnLogin2 = findViewById(R.id.btnLogin2)

        btnLogin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}