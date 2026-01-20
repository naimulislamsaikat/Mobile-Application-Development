package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class HomeActivity : AppCompatActivity() {
    lateinit var ic_back: ImageView
    lateinit var ic_menu: ImageView
    lateinit var tab_cards: TextView
    lateinit var textView47: TextView
    lateinit var textView48: TextView
    lateinit var textView49: TextView

    val db = FirebaseDatabase.getInstance()
    val ref = db.reference.child("Users")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_back = findViewById(R.id.ic_back)
        ic_menu = findViewById(R.id.ic_menu)
        tab_cards = findViewById(R.id.tab_cards)
        textView47 = findViewById(R.id.textView47)
        textView48 = findViewById(R.id.textView48)
        textView49 = findViewById(R.id.textView49)

        ic_back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        ic_menu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        tab_cards.setOnClickListener {
            val intent = Intent(this, HomeActivity2::class.java)
            startActivity(intent)
            finish()
        }
        ref.child("User1").child("Name").get().addOnSuccessListener {
            textView47.text = it.value.toString()
        }.addOnFailureListener {
            textView47.text = "Internal Server error"
         }

        ref.child("User1").child("Account Type").get().addOnSuccessListener {
            textView48.text = it.value.toString()
        }.addOnFailureListener {
            textView48.text = "Internal Server error Or A/C type not found"
        }

        ref.child("User1").child("Account").get().addOnSuccessListener {
            textView49.text = it.value.toString()
        }.addOnFailureListener {
            textView49.text = "A/C number not found in server"
        }

//        ref.get().addOnSuccessListener {
//            textView47.text = it.child("User1").child("Name").value.toString()
//            textView48.text = it.child("User1").child("Account Type").value.toString()
//            textView49.text = it.child("User1").child("Account").value.toString()
//        }.addOnFailureListener {
//            textView48.text = "MISSING"
//        }

    }
}