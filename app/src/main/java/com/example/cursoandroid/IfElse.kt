package com.example.cursoandroid

fun main() {
//    ifBasico()
    ifAnidado()
}

fun ifBasico() {
    val name = "Pedro"

    if (name == "Pepe") {
        println("La variable name es Pedro")
    }else {
        println("La variable name no es Pedro")
    }
}

fun ifAnidado() {
    val animal = "Loro"

    if (animal == "Perro") {
        println("Es un Perro")
    } else if (animal == "Gato") {
        println("Es un Gato")
    } else if (animal == "Loro") {
        println("Es un Loro")
    } else {
        println("No es un animal")
    }
}