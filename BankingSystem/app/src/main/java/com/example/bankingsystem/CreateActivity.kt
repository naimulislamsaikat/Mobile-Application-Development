package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.database.FirebaseDatabase

class CreateActivity : AppCompatActivity() {
    lateinit var CancelBtn: Button
    lateinit var btnSubmit: Button
    lateinit var etName: EditText
    lateinit var etName2: EditText
    lateinit var checkbox: CheckBox

    val db = FirebaseDatabase.getInstance()
    val ref = db.reference.child("Users")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        CancelBtn = findViewById(R.id.CancelBtn)
        btnSubmit = findViewById(R.id.btnSubmit)
        checkbox = findViewById(R.id.checkBox)
        etName = findViewById(R.id.etName)
        etName2 = findViewById(R.id.etName2)

        CancelBtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnSubmit.setOnClickListener {
            if(etName.text.toString().isEmpty() && etName2.text.toString().isEmpty() && checkbox.isClickable){
                Toast.makeText(this, "Please type all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}