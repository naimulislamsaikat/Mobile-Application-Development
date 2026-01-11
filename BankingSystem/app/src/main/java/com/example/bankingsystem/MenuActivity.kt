package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    lateinit var ic_back2: ImageView
    lateinit var profileBtn: Button
    lateinit var Accbtn: Button
    lateinit var Cardbtn: Button
    lateinit var Loanbtn: Button
    lateinit var AccLbtn: Button
    lateinit var CardLbtn: Button
    lateinit var btn: Button
    lateinit var logoutbtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back2 = findViewById(R.id.ic_back2)
        profileBtn = findViewById(R.id.profileBtn)
        Accbtn = findViewById(R.id.Accbtn)
        Cardbtn = findViewById(R.id.Cardbtn)
        Loanbtn = findViewById(R.id.Loanbtn)
        AccLbtn = findViewById(R.id.AccLbtn)
        CardLbtn = findViewById(R.id.CardLbtn)
        btn = findViewById(R.id.btn)
        logoutbtn = findViewById(R.id.logoutbtn)

        ic_back2.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        profileBtn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
        Accbtn.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
            finish()
        }
        Cardbtn.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
            finish()
        }
        Loanbtn.setOnClickListener {
            val intent = Intent(this, LoanActivity::class.java)
            startActivity(intent)
            finish()
        }
        AccLbtn.setOnClickListener {
            val intent = Intent(this, AccountLockActivity::class.java)
            startActivity(intent)
            finish()
        }
        CardLbtn.setOnClickListener {
            val intent = Intent(this, CardLockActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn.setOnClickListener {
            val intent = Intent(this, TearmsActivity::class.java)
            startActivity(intent)
            finish()
        }
        logoutbtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}