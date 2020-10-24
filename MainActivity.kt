package com.example.applatihantugas3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgBtn = findViewById<ImageButton>(R.id.imgButtonSave)
        imgBtn.setOnClickListener {
            Toast.makeText(getBaseContext(), "Berhasil", Toast.LENGTH_LONG).show()
        }
    }
}