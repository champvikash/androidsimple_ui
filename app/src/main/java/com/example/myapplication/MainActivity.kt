package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var secondActbutton = findViewById<Button>(R.id.btn1)
        secondActbutton.setOnClickListener{
            val Intent = Intent(this,MainActivity4::class.java)
            startActivity(
                Intent
            )
        }
    }
}