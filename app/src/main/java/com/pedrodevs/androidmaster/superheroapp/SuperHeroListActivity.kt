package com.pedrodevs.androidmaster.superheroapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import com.example.cursoandroid.databinding.ActivitySuperHeroListBinding
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class SuperHeroListActivity : AppCompatActivity() {

    //        ESTO ES EL BINDING
    private lateinit var binding: ActivitySuperHeroListBinding

    // SE CREARA OBJETO RETROFIT
    private lateinit var retrofit: Retrofit

    //        CREO UN MÉTODO
    override fun onCreate(savedInstanceState: Bundle?) {

//        LLAMA A LA FUNCION
        super.onCreate(savedInstanceState)

        //        ENCARGA EL LAYOUT
        binding = ActivitySuperHeroListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //        SE CREA PANTALLA
        retrofit = getRetrofit()

//        PRIMER COMPONENTE initUI
        initUI()
    }

    //        DEBE COINCIDIR CON EL SEARCHVIEW DEL XML E IMPLEMENTAR MIEMBROS OBJECT
    private fun initUI() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            //            LISTENER
            override fun onQueryTextSubmit(query: String?): Boolean {

//                CREO FUNCION PARA BUSQUEDA
                searchByName(query.orEmpty())

                return false
            }

            //            LISTENER SE DEBE MANTENER
            override fun onQueryTextChange(newText: String?) = false
        })
    }

    //        FUNCION DE BUSQUEDA FUERA
    private fun searchByName(query: String) {
    }

    //    INSTANCIO RETROFIT
    private fun getRetrofit(): Retrofit {

//        CREO OBJETO RETROFIT
        return Retrofit
            .Builder()
            .baseUrl("https://superheroapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}