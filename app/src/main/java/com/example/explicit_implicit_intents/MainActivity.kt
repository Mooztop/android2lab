package com.example.explicit_implicit_intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnexplicit1=findViewById<Button>(R.id.button2)

        btnexplicit1.setOnClickListener{
            intent= Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
        val btnimplict= findViewById<Button>(R.id.button3)
        btnimplict.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/%D0%B0%D0%B4%D0%B8%D0%BB%D1%8C-%D0%B1%D0%BE%D1%80%D0%B0%D0%BD%D0%BA%D1%83%D0%BB%D0%BE%D0%B2-519ab62a3?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app")
            startActivity(intent)
        }
        val btnexplicit2 = findViewById<Button>(R.id.button4)
        btnexplicit2.setOnClickListener {
            val intent1 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent1)
        }

    }
}