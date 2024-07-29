package com.example.cursoandroid

fun main() {
    getMonth(10)
}

fun getMonth(month: Int) {
    when (month) {
        in 1..6 -> print("Primer semestre")
        in 7..12 -> print("Segundo semestre")
        !in 1..12 -> print("Semestre no valido")
    }
}
