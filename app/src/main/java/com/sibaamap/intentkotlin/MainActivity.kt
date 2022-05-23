package com.sibaamap.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_intent)

        button.setOnClickListener(){
            callActivity()
        }
    }

    private fun callActivity() {
        val edtName = findViewById<EditText>(R.id.edt_name)
        val message = edtName.text.toString()

        val intent = Intent(this, MainActivity2::class.java).also {
            it.putExtra("EXTRA_MESSAGE",message)
            startActivity(it);
        }
    }
}