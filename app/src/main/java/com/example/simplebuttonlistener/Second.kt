package com.example.simplebuttonlistener

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Second : AppCompatActivity() {

    private lateinit var showTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

        showTV= findViewById(R.id.showTV)
        showTV.text= intent.extras!!.getString("Message")

    }
}