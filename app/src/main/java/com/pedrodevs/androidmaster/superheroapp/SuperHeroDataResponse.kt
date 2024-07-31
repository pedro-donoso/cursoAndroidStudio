package com.pedrodevs.androidmaster.superheroapp

import com.google.gson.annotations.SerializedName

// RESPUESTA
data class SuperHeroDataResponse(
    @SerializedName("response") val response: String,
    @SerializedName("results-for") val resultsFor: String,
    @SerializedName("results") val superheroes: List<SuperheroItemResponse>
)

data class SuperheroItemResponse(
    @SerializedName("id") val superheroId: String,
    @SerializedName("name") val name: String
)
