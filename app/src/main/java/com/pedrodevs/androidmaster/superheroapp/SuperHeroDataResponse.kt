package com.pedrodevs.androidmaster.superheroapp

import com.google.gson.annotations.SerializedName

// RESPUESTA
data class SuperHeroDataResponse(@SerializedName("response") val response: String)