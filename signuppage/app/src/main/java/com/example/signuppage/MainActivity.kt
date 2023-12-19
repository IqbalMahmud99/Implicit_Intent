package com.example.signuppage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.time.Instant

class MainActivity : AppCompatActivity() {

    private lateinit var nextpg : Button
    private lateinit var urname : EditText
    private lateinit var urage : EditText
    private lateinit var uremail : EditText
    private lateinit var uraddress : EditText




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        nextpg = findViewById(R.id.button)
        urname = findViewById(R.id.user)
        urage = findViewById(R.id.age)
        uremail = findViewById(R.id.email)
        uraddress =findViewById(R.id.address)

        nextpg.setOnClickListener {
            var age = urage.text.toString()
            var email = uremail.text.toString()
            var address = uraddress.text.toString()
            var myname = urname.text.toString()

            var iqbal = Intent (this@MainActivity,Home_Activity::class.java)
            intent.putExtra("massege",myname)
            intent.putExtra("massege1",email)
            intent.putExtra("Int",age)
            intent.putExtra("massege2",address)
            startActivity(iqbal)
        }
    }
}