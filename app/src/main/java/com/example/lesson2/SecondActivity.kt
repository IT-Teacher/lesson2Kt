package com.example.lesson2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var ss = intent.getStringExtra("name")
        var s = intent.getStringExtra("age")

        val res = findViewById<TextView>(R.id.textView)

        res.setText("$ss  $s")


    }
}


