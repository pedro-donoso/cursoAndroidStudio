package com.cursoandroid.main.firstapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.cursoandroid.R

//funcion principal
class FirstAppActivity : AppCompatActivity() {

    //metodo principal onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //vinculamos esta vista
        setContentView(R.layout.activity_first_app)

        val btnStart = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnStart)
        btnStart.setOnClickListener {
            Log.i("pedro", "Has pulsado el boton")
        }
    }
}