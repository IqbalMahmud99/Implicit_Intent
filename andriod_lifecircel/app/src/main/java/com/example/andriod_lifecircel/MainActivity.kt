package com.example.andriod_lifecircel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var yourname : EditText
    private lateinit var goback:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        yourname = findViewById(R.id.yournm)

      goback=findViewById(R.id.goback)

      goback.setOnClickListener {
          var yourname = yourname.text.toString()
       var intent = Intent(this@MainActivity,homeactivity::class.java)
      intent.putExtra("massege",yourname)
        startActivity(intent)
      }
//        Toast.makeText(this@MainActivity, "on create", Toast.LENGTH_SHORT).show()
    }




















//    override fun onStart() {
//        super.onStart()
//        Toast.makeText(this@MainActivity, "on Start", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Toast.makeText(this@MainActivity, "call on resume", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Toast.makeText(this@MainActivity, "call onrestart", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Toast.makeText(this@MainActivity, "call onpause", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Toast.makeText(this@MainActivity, "call onstop", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Toast.makeText(this@MainActivity, "call ondestory", Toast.LENGTH_SHORT).show()
//    }

}