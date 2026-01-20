package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.database.FirebaseDatabase

class LoanActivity : AppCompatActivity() {
    lateinit var ic_back4: ImageView
    lateinit var button2: Button
    lateinit var textView6: TextView
    lateinit var textView3: TextView
    lateinit var button: Button

    val db = FirebaseDatabase.getInstance()
    val ref = db.reference.child("Users")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loan)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back4 = findViewById(R.id.ic_back4)
        button2 = findViewById(R.id.button2)
        textView6 = findViewById(R.id.textView6)
        textView3 = findViewById(R.id.textView3)
        button = findViewById(R.id.button)


        ref.child("User1").child("Loan").get().addOnSuccessListener {
            textView6.text = it.value.toString()
        }.addOnFailureListener {
            textView6.text = "Internal Server error"
        }
        ref.child("User1").child("Loan Instalment").get().addOnSuccessListener {
            textView3.text = it.value.toString()
        }.addOnFailureListener {
            textView3.text = "Internal Server error"
        }

        ic_back4.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        button2.setOnClickListener {
            Toast.makeText(this, "Loan limit exceeded. Repay first", Toast.LENGTH_SHORT).show()
        }
        button.setOnClickListener {
            val intent = Intent(this, LoanPayActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}