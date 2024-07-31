package com.pedrodevs.androidmaster.superheroapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cursoandroid.databinding.ActivitySuperHeroListBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class SuperHeroListActivity : AppCompatActivity() {
    //        ESTO ES EL BINDING
    private lateinit var binding: ActivitySuperHeroListBinding
    // SE CREARA OBJETO RETROFIT
    private lateinit var retrofit: Retrofit
    //    SE CREA UNA LISTA
    private lateinit var adapter: SuperheroAdapter

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

        //CREO ADAPTER
        adapter = SuperheroAdapter()
        binding.rvSuperHero.setHasFixedSize(true)
        binding.rvSuperHero.layoutManager = LinearLayoutManager(this)
        binding.rvSuperHero.adapter = adapter

    }

    //        FUNCION DE BUSQUEDA FUERA
    private fun searchByName(query: String) {
        binding.progressBar.isVisible = true
        CoroutineScope(Dispatchers.IO).launch {
            val myResponse: Response<SuperHeroDataResponse> =
                retrofit.create(ApiService::class.java).getSuperheroes(query)
            if (myResponse.isSuccessful) {
                Log.i("pedro", "Funciona :)")
                val response: SuperHeroDataResponse? = myResponse.body()
                if (response != null) {
                    Log.i("pedro", response.toString())
                    runOnUiThread {
                        adapter.updateList(response.superheroes)
                        binding.progressBar.isVisible = false
                    }
                }
            } else {
                Log.i("pedro", "No funciona :(")
            }
        }
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