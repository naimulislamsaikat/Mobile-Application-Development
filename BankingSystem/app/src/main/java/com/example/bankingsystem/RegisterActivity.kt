package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    lateinit var uId: EditText
    lateinit var uId2: EditText
    lateinit var uId3: EditText
    lateinit var uId4: EditText
    lateinit var uId5: EditText
    lateinit var uId6: EditText
    lateinit var uId7: EditText
    lateinit var uPassword: EditText
    lateinit var regApp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        uId = findViewById<EditText>(R.id.uId)
        uId2 = findViewById<EditText>(R.id.uId2)
        uId3 = findViewById<EditText>(R.id.uId3)
        uId4 = findViewById<EditText>(R.id.uId4)
        uId5 = findViewById<EditText>(R.id.uId5)
        uId6 = findViewById<EditText>(R.id.uId6)
        uId7 = findViewById<EditText>(R.id.uId7)
        uPassword = findViewById<EditText>(R.id.uPassword)
        regApp = findViewById<Button>(R.id.regApp)

        regApp.setOnClickListener {
            if(uId.text.toString().isEmpty() && uId2.text.toString().isEmpty() && uId3.text.toString().isEmpty() && uId4.text.toString().isEmpty() && uId5.text.toString().isEmpty() && uId6.text.toString().isEmpty() && uId7.text.toString().isEmpty() && uPassword.text.toString().isEmpty()){
                Error("Required")
                Toast.makeText(this, "Enter all the fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Registration Successful. Wait for approval.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}