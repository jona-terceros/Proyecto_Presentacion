package com.example.proyecto_presentacion_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity  : AppCompatActivity(){
    lateinit var home_tv: TextView
    lateinit var button_play: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        button_play = findViewById(R.id.button_play)
        home_tv = findViewById(R.id.home_tv)
    }

}