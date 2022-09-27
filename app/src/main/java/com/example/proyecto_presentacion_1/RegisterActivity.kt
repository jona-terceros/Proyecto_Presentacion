package com.example.proyecto_presentacion_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class RegisterActivity : AppCompatActivity() {
    lateinit var btn_register: Button
    lateinit var et_fullname: EditText
    lateinit var et_correo_electronico: EditText
    lateinit var et_password: EditText
    lateinit var et_password_confirm: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_register = findViewById(R.id.btn_register)
        btn_register.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}