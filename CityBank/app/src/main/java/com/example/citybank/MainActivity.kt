package com.example.citybank

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnLogin.setOnClickListener {

            val etUserId = findViewById<EditText>(R.id.etUserId).text.toString()
            val etPassword = findViewById<EditText>(R.id.etPassword).text.toString()

            if (etUserId.isEmpty() || etPassword.isEmpty()) {
                Toast.makeText(this, "Enter email and password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else{
                val intent = Intent(this, DashboardActivity::class.java)
//                intent.putExtra("mail", etUserId)
//                intent.putExtra("pass", etPassword)
                startActivity(intent)

            }

            // Use email/password (example: log or pass to auth)
            //Log.d("MainActivity", "Email: $etUserId, Password: $etPassword")
            //Toast.makeText(this, "Signed in as $etUserId", Toast.LENGTH_SHORT).show()
        }
    }
}