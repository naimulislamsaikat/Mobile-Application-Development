package com.example.citybank

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {
    lateinit var backBtn: Button
    lateinit var btnSubmit: Button

//    var mail = intent.getStringExtra("mail")
//    var pass = intent.getStringExtra("pass")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        backBtn = findViewById(R.id.menuBtn)
        backBtn.setOnClickListener {
            val intent = Intent(this, MoreActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnSubmit = findViewById(R.id.btnSubmit2)

        val name = findViewById<TextView>(R.id.textView40)
        val email = findViewById<TextView>(R.id.textView41)
        val contact = findViewById<TextView>(R.id.textView42)
        val password = findViewById<TextView>(R.id.textView43)

        btnSubmit.setOnClickListener { name.text=name.text.toString()
            email.text=email.text.toString()
            contact.text=contact.text.toString()
            password.text=password.text.toString()
            Toast.makeText(this, "Updated", Toast.LENGTH_SHORT).show()
        }


//        val em = findViewById<TextView>(R.id.textView41)
//        val ps = findViewById<TextView>(R.id.textView43)

//        em.text = mail.toString()
//        ps.text = pass.toString()


    }

//        val receivedEmail = intent.getStringExtra(ProfileActivity.Companion.EXTRA_USER_EMAIL)
//        val receivedPassword = intent.getStringExtra(ProfileActivity.Companion.EXTRA_USER_PASSWORD)
//
//        Log.d("ProfileActivity", "Email: $receivedEmail, Password: $receivedPassword")
//        Toast.makeText(this, "Email: $receivedEmail\nPassword: $receivedPassword", Toast.LENGTH_LONG).show()
}