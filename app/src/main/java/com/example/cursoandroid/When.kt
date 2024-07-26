package com.example.cursoandroid

fun main() {
    getMonth(1)
}

fun getMonth(month: Int) {
    when (month) {
        in 1..6 -> print("Primer semestre")
        in 7..12 -> print("Segundo semestre")
        else -> print("No es un mes valido")
    }
}