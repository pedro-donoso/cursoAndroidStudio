package com.pedrodevs.androidmaster.firstapp

import android.content.Intent
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

        val btnStart = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnStart)
        val etName = findViewById<androidx.appcompat.widget.AppCompatEditText>(R.id.etName)

        etName.text.toString()

        btnStart.setOnClickListener {
            val name = etName.text.toString()

            if (name.isNotEmpty()) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }


        }
    }
}