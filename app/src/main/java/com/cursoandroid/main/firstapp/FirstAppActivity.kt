package com.cursoandroid.main.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cursoandroid.R

//funcion principal
class FirstAppActivity : AppCompatActivity() {

    //metodo principal onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //vinculamos esta vista
        setContentView(R.layout.activity_first_app)
    }
}