package com.example.cursoandroid

fun main() {
//    ifBasico()
      ifInt()
}

fun ifBasico() {
    val name = "Pedro"

    if (name == "Pepe") {
        println("La variable name es Pedro")
    }else {
        println("La variable name no es Pedro")
    }
}

fun ifInt() {
    val age = 30

    if (age > 18) {
        println("Es mayor de edad")
    } else {
        println("Es menor de edad")
    }
}