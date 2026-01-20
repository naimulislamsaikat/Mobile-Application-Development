package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoanPayActivity : AppCompatActivity() {
    lateinit var editTextNumberDecimal: EditText
    lateinit var editTextNumberPassword: EditText
    lateinit var textView20: TextView
    lateinit var textView26: TextView
    lateinit var imageView21: ImageView
    lateinit var repay: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loan_pay)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        editTextNumberDecimal = findViewById<EditText>(R.id.editTextNumberDecimal)
        editTextNumberPassword = findViewById<EditText>(R.id.editTextNumberPassword)
        textView20 = findViewById<TextView>(R.id.textView20)
        textView26 = findViewById<TextView>(R.id.textView26)
        imageView21 = findViewById<ImageView>(R.id.imageView21)
        repay = findViewById<Button>(R.id.repay)

        imageView21.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
//        }
//        editTextNumberDecimal.setOnClickListener {
//            if(editTextNumberDecimal.text.toString().isEmpty()){
//                Error("Enter Amount")
//                Toast.makeText(this, "Enter Amount", Toast.LENGTH_SHORT).show()
//                return@setOnClickListener
//            }
//        }
//        editTextNumberPassword.setOnClickListener {
//            if(editTextNumberPassword.text.toString().isEmpty()){
//                Error("Enter Password")
//                Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show()
//                return@setOnClickListener
//            }
//        }

            repay.setOnClickListener {
                if (editTextNumberDecimal.text.toString().isEmpty() && editTextNumberPassword.text.toString().isEmpty()){
                    Toast.makeText(this, "Enter all the fields", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                    Toast.makeText(this, "Payment Successful", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MenuActivity::class.java)
                    startActivity(intent)
                    finish()
            }
        }
    }
}