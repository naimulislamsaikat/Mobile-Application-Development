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

class ForgotActivity : AppCompatActivity() {
    lateinit var fUId: EditText
    lateinit var fUId2: EditText
    lateinit var fUid3: EditText
    lateinit var fUid4: EditText
    lateinit var fUid5: EditText
    lateinit var fUid6: EditText
    lateinit var forg: Button
    lateinit var checkBox2: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_forgot)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        fUId = findViewById(R.id.fUId)
        fUId = findViewById(R.id.fUid2)
        fUid3 = findViewById(R.id.fUid3)
        fUid4 = findViewById(R.id.fUid4)
        fUid5 = findViewById(R.id.fUid5)
        fUid6 = findViewById(R.id.fUid6)
        forg = findViewById(R.id.forg)
        checkBox2 = findViewById(R.id.checkBox2)

        forg.setOnClickListener {
            if(fUId.text.toString().isEmpty() && fUId2.text.toString().isEmpty() && fUid3.text.toString().isEmpty() && fUid4.text.toString().isEmpty() && fUid5.text.toString().isEmpty() && fUid6.text.toString().isEmpty() && checkBox2.isClickable){
                Toast.makeText(this, "Please enter your credentials", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Password Requested for Change", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}