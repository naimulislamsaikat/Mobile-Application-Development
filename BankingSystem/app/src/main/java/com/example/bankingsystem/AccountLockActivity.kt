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

class AccountLockActivity : AppCompatActivity() {
    lateinit var ic_back7: ImageView
    lateinit var btnSubmit: Button
    lateinit var cancelBtn: Button
    lateinit var etName: EditText
    lateinit var etName2: EditText
    lateinit var etName3: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_account_lock)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back7 = findViewById(R.id.ic_back7)
        btnSubmit = findViewById(R.id.btnSubmit)
        cancelBtn = findViewById(R.id.cancelBtn)
        etName = findViewById(R.id.etName)
        etName2 = findViewById(R.id.etName2)
        etName3 = findViewById(R.id.etName3)

        ic_back7.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        cancelBtn.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnSubmit.setOnClickListener {
            if(etName.text.toString().isEmpty() && etName2.text.toString().isEmpty() && etName3.text.toString().isEmpty()){
                etName.error = "Required"
                etName2.error = "Required"
                etName3.error = "Required"

                Toast.makeText(this, "Please type all the fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else{
                Toast.makeText(this, "Account Lock Requested Successfully", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
                finish()
            }

//            if(etName.text.toString() == "Name" || etName2.text.toString() == "Account Type" || etName3.text.toString() == "Branch Name"){
//                etName.error = "Required"
//                etName2.error = "Required"
//                etName3.error = "Required"
//            }
//            else{
//                Toast.makeText(this, "Account Lock Apply Successfully", Toast.LENGTH_SHORT).show()
//            }
        }
    }
}