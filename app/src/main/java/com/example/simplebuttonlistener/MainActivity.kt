package com.example.simplebuttonlistener

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var kotlinButton: Button
    private lateinit var entryET: EditText
    private lateinit var entry2ET: EditText
    private lateinit var entry3ET: EditText
    private lateinit var showTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinButton= findViewById(R.id.kotlinButton)
        entryET= findViewById(R.id.entryET)
        entry2ET= findViewById(R.id.entry2ET)
        entry3ET= findViewById(R.id.entry3ET)
        showTV= findViewById(R.id.showTV)

        kotlinButton.setOnClickListener{
            if (entryET.text.isNotBlank())
                showTV.text= entryET.text
            else
                Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show()

        }

    }

    fun xmlClick(view: View) {
        if (entry2ET.text.isNotBlank())
            Toast.makeText(this,entry2ET.text.toString(),Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show()
    }

    fun goClick(view: View) {
        if (entry3ET.text.isNotBlank()){
            val intent= Intent(this,Second::class.java)
            intent.putExtra("Message",entry3ET.text.toString())
            startActivity(intent)
        }
        else
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show()
    }
}