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

class CardLockActivity : AppCompatActivity() {
    lateinit var ic_back70: ImageView
    lateinit var btnSub: Button
    lateinit var canBtn: Button
    lateinit var etName4: EditText
    lateinit var etName5: EditText
    lateinit var etName6: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_card_lock)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back70 = findViewById(R.id.ic_back70)
        btnSub = findViewById(R.id.btnSub)
        canBtn = findViewById(R.id.canBtn)
        etName4 = findViewById(R.id.etName4)
        etName5 = findViewById(R.id.etName5)
        etName6 = findViewById(R.id.etName6)

        ic_back70.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnSub.setOnClickListener{
            if(etName4.text.toString().isEmpty() && etName5.text.toString().isEmpty() && etName6.text.toString().isEmpty()){
                etName4.error = "Required"
                etName5.error = "Required"
                etName6.error = "Required"
                Toast.makeText(this, "Please type all the fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else{
                Toast.makeText(this, "Card Lock Apply Successfully", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        canBtn.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}