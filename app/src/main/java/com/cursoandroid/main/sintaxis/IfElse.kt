package com.cursoandroid.main.sintaxis

fun main() {
//    ifBasico()
//      ifMultiple()
    ifMultipleOr()
}

fun ifBasico() {
    val name = "Pedro"

    if (name == "Pepe") {
        println("La variable name es Pedro")
    }else {
        println("La variable name no es Pedro")
    }
}

fun ifMultiple() {
    var age = 18
    var parentPermission = true
    var imHappy = true

    if (age >= 18 && parentPermission && imHappy) {
        println("Puede beber cerveza")
    }
}

fun ifMultipleOr(){
    var pet = "dog"
    var imHappy = true

    if (pet == "dog" || (pet == "cat" && imHappy)){
        println("Es un gato o un perro")
    }
}