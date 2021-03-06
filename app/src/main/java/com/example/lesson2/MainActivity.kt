package com.example.lesson2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val send=findViewById<Button>(R.id.button)

        val name = findViewById<EditText>(R.id.name)
        val age = findViewById<EditText>(R.id.age)

        send.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("name",name.text.toString())
                putExtra("age",age.text.toString())
            }
            startActivity(intent)
        }



    }
}