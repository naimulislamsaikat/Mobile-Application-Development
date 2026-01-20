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
import com.google.firebase.database.FirebaseDatabase

class ProfileActivity : AppCompatActivity() {
    lateinit var ic_back3: ImageView
    lateinit var textView40: EditText
    lateinit var textView41: EditText
    lateinit var textView42: EditText
    lateinit var textView43: EditText
    lateinit var btnSubmit2: Button

    val db = FirebaseDatabase.getInstance()
    val ref = db.reference.child("Users")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back3 = findViewById(R.id.ic_back3)
        textView40 = findViewById(R.id.textView40)
        textView41 = findViewById(R.id.textView41)
        textView42 = findViewById(R.id.textView42)
        textView43 = findViewById(R.id.textView43)
        btnSubmit2 = findViewById(R.id.btnSubmit2)

        ic_back3.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnSubmit2.setOnClickListener {
            ref.child("User1").child("Name").setValue(textView40.text.toString())
            ref.child("User1").child("Email").setValue(textView41.text.toString())
            ref.child("User1").child("Phone").setValue(textView42.text.toString())
            ref.child("User1").child("Password").setValue(textView43.text.toString())
            if(textView40.text.toString().isEmpty() && textView41.text.toString().isEmpty() && textView42.text.toString().isEmpty() && textView43.text.toString().isEmpty()){
                textView40.error = "Required Full Name"
                textView41.error = "Required Email"
                textView42.error = "Required Phone"
                textView43.error = "Required Password"
                Toast.makeText(this, "Please Fill All Fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                Toast.makeText(this, "Profile Updated", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}