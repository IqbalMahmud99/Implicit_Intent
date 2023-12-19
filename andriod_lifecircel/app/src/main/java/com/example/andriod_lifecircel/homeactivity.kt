package com.example.andriod_lifecircel

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class homeactivity : AppCompatActivity() {
    private lateinit var yourname : TextView
    private lateinit var backhm : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeactivity)
        backhm = findViewById(R.id.backhm)
        yourname = findViewById(R.id.viewtex)
        var name = intent.getStringExtra("massege")

        yourname.text = name.toString()


        backhm.setOnClickListener {
            startActivity(Intent(this@homeactivity,MainActivity::class.java))
        }
    }
}