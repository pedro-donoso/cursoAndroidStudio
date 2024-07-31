package com.pedrodevs.androidmaster.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cursoandroid.databinding.ItemSuperheroeBinding

class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroeBinding.bind(view)

    fun bind(superheroItemResponse: SuperheroItemResponse){
        binding.tvSuperheroName.text = superheroItemResponse.name
    }
}