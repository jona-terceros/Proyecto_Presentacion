package com.example.proyecto_presentacion_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var name_proyect_app: TextView
    lateinit var btnCreateAccount: Button
    lateinit var button_home: Button
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_home = findViewById(R.id.button_home)
        btnCreateAccount = findViewById(R.id.btnCreateAccount)
        name_proyect_app=findViewById(R.id.name_proyect_app)

        button_home.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        btnCreateAccount.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

    }
}