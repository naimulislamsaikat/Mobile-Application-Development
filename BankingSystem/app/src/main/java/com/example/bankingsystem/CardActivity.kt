package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CardActivity : AppCompatActivity() {
    lateinit var ic_back5: ImageView
    lateinit var vcBtn: Button
    lateinit var recBtn: Button
    lateinit var billBtn: Button
    lateinit var vcBtn5: Button
    lateinit var insBtn: Button
    lateinit var payBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_card)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back5 = findViewById(R.id.ic_back5)
        vcBtn = findViewById(R.id.vcBtn)
        recBtn = findViewById(R.id.recBtn)
        billBtn = findViewById(R.id.billBtn)
        vcBtn5 = findViewById(R.id.vcBtn5)
        insBtn = findViewById(R.id.insBtn)
        payBtn = findViewById(R.id.payBtn)

        ic_back5.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        vcBtn.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
            finish()
        }
        recBtn.setOnClickListener {
            val intent = Intent(this, RechargeActivity::class.java)
            startActivity(intent)
            finish()
        }
//        billBtn.setOnClickListener {
//            val intent = Intent(this, BillsActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
        vcBtn5.setOnClickListener {
            val intent = Intent(this, SavedAccountActivity::class.java)
            startActivity(intent)
            finish()
        }
//        insBtn.setOnClickListener {
//            val intent = Intent(this, InsuranceActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
//        payBtn.setOnClickListener {
//            val intent = Intent(this, InstantPaymentActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
    }
}