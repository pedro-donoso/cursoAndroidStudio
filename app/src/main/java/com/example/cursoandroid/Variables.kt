package com.example.cursoandroid

const val saludo = "Hola"
const val nombre = "Pedro"
const val edad = 30

fun hello(){
    val hello = "Hola"
    println(hello)
}

fun name() {
    val name = "Pedro"
    println(name)
}

fun age() {
    val age= 30
    println(age)
}


fun concatenacion() {
    val concatenacion = "$saludo me llamo $nombre y tengo $edad años"
    println(concatenacion)
}

fun main(){
    hello()
    name()
    age()
    concatenacion()
}


