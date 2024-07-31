package com.pedrodevs.androidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.cursoandroid.R
import com.pedrodevs.androidmaster.superheroapp.SuperHeroListActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSuperhero = findViewById<Button>(R.id.btnSuperhero)
//        BOTON
        btnSuperhero.setOnClickListener { navigateToSuperheroApp() }
    }

//        NAVEGACION
    private fun navigateToSuperheroApp() {
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }

}