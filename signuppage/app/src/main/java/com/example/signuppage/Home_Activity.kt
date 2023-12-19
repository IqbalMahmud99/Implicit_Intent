package com.example.signuppage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Home_Activity : AppCompatActivity() {


    private lateinit var backhm : Button
    private lateinit var shownm : TextView
    private lateinit var showag : TextView
    private lateinit var showmail : TextView
    private lateinit var showaddres :TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)



        showag = findViewById(R.id.showage)
        backhm = findViewById(R.id.showbutton)
        shownm = findViewById(R.id.showusernm)
        showmail = findViewById(R.id.showemail)
        showaddres = findViewById(R.id.showaddrs)

        var age = intent.getStringExtra("Int")
        showag.text = age.toString()
        var addres = intent.getStringExtra("massege2")
        showaddres.text = addres.toString()
        var email = intent.getBooleanArrayExtra("massege1")
        showmail.text = email.toString()
        var name = intent.getStringExtra("massege")
        shownm.text = name.toString()

        backhm.setOnClickListener {
            startActivity(Intent(this@Home_Activity,MainActivity::class.java))
        }

    }
}