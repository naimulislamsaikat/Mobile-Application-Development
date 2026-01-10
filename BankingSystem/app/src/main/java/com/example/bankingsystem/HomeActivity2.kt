package com.example.bankingsystem

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity2 : AppCompatActivity() {

    lateinit var ic_Back: ImageView
    lateinit var ic_Menu: ImageView
    lateinit var tab_acc: TextView
    lateinit var tab_card: TextView
    lateinit var create_new: LinearLayout
    lateinit var textView46: TextView
    lateinit var textView50: TextView
    lateinit var textView51: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ic_Back = findViewById(R.id.ic_Back)
        ic_Menu = findViewById(R.id.ic_Menu)
        tab_acc = findViewById(R.id.tab_acc)
        tab_card = findViewById(R.id.tab_card)
        create_new = findViewById(R.id.create_new)
        textView46 = findViewById(R.id.textView46)
        textView50 = findViewById(R.id.textView50)
        textView51 = findViewById(R.id.textView51)

        ic_Back.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        ic_Menu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        tab_acc.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        tab_card.setOnClickListener {
            val intent = Intent(this, HomeActivity2::class.java)
            startActivity(intent)
            finish()
        }
        create_new.setOnClickListener {
            val intent = Intent(this, CreateActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}