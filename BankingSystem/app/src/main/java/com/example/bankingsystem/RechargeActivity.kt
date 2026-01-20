package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.database.FirebaseDatabase

class RechargeActivity : AppCompatActivity() {
    lateinit var ic_back4: ImageView
    lateinit var payBtn: Button
    lateinit var amount: EditText
    lateinit var editTextPhone: EditText

    val db = FirebaseDatabase.getInstance()
    val ref = db.reference.child("Users")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recharge)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back4 = findViewById(R.id.ic_back4)
        payBtn = findViewById(R.id.payBtn)

        ic_back4.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
            finish()
        }
        payBtn.setOnClickListener {
            if(amount.text.toString().isEmpty() && editTextPhone.text.toString().isEmpty()) {
                Toast.makeText(this, "Please type all the fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Recharge Successful", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}