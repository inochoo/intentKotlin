package com.sibaamap.intentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val message = intent.getStringExtra("EXTRA_MESSAGE")


        val name = findViewById<TextView>(R.id.tv_name).apply {
            text = message
        }

    }
}