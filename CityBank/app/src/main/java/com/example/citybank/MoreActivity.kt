package com.example.citybank

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MoreActivity : AppCompatActivity() {
    lateinit var btnLogOut: Button
    lateinit var btnBack: Button
    lateinit var btnPersonalProfile: Button
    lateinit var btnMobileRecharge: Button
    lateinit var btnCityCreditCard: Button
    lateinit var btnInsurance: Button
    lateinit var btnBillsAndFees: Button
    lateinit var btnValueAddedServices: Button
    lateinit var btnVisaInstantPayment: Button
    lateinit var btnPaymentHistory: Button
    lateinit var btnFavouriteAccounts: Button
    lateinit var btnBankTransfer: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_more)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnLogOut = findViewById(R.id.logOut)
        btnBack = findViewById(R.id.menuBtn)
        btnPersonalProfile = findViewById(R.id.button11)
        btnMobileRecharge = findViewById(R.id.button)
        btnCityCreditCard = findViewById(R.id.button3)
        btnInsurance = findViewById(R.id.button4)
        btnBillsAndFees = findViewById(R.id.button5)
        btnValueAddedServices = findViewById(R.id.button6)
        btnVisaInstantPayment = findViewById(R.id.button7)
        btnPaymentHistory = findViewById(R.id.button8)
        btnFavouriteAccounts = findViewById(R.id.button9)
        btnBankTransfer = findViewById(R.id.Transferbutton)

        btnLogOut.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnBack.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
        btnPersonalProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        btnMobileRecharge.setOnClickListener {
            val intent = Intent(this, RechargeActivity::class.java)
            startActivity(intent)
        }
        btnCityCreditCard.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
        }
        btnInsurance.setOnClickListener {
            val intent = Intent(this, InsuranceActivity::class.java)
            startActivity(intent)
        }
        btnBillsAndFees.setOnClickListener {
            val intent = Intent(this, BillsAndFeesActivity::class.java)
            startActivity(intent)
        }
        btnValueAddedServices.setOnClickListener {
            val intent = Intent(this, ValueAddedServicesActivity::class.java)
            startActivity(intent)
        }

    }
}