package com.wiwi.proyecto_presentacion_1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity  : AppCompatActivity(){
    lateinit var home_tv: TextView
    lateinit var button_play: Button
    lateinit var rvTracks : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        home_tv = findViewById(R.id.home_tv)
        rvTracks = findViewById(R.id.rv_tracks)
        val list = arrayListOf<Track>(
            Track("I was made for loving you", "Queen"),
            Track("How deep is your love", "Bee Gees"),
            Track("Beat it", "Michael Jackson"),
            Track("24K magic", "Bruno Mars"),
            Track("Californication", "Red Hot Chili Peppers"),
            Track("Dance, dance", "Fall Out Boy"),
            Track("Future days", "Pearl Jam"),
            Track("Hello", "Lionel Richie"),
            Track("Imagine", "John Lennon"),
            Track("No te apartes de mi", "Vicentico"),
            Track("Take me out", "Franz Ferdinand")
        )

        val linearLayout = LinearLayoutManager(this)
        linearLayout.orientation = LinearLayoutManager.VERTICAL

        rvTracks.layoutManager = linearLayout
        rvTracks.adapter = TrackAdapter(list, applicationContext)
    }

}