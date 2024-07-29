package com.example.cursoandroid.exercises

fun main(){
    //inmutableList()
    mutableList()
}

fun mutableList(){
    val weekDays: MutableList<String>  = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add(0,"PedroDay")
    println(weekDays)

}

fun inmutableList(){
    val readOnly: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    //println(readOnly.size)
    //println(readOnly)
    //println(readOnly[0])
    //println(readOnly.last())
    //println(readOnly.first())

    // val example = readOnly.filter { it.contains("a") }
    // println(example)

    readOnly.forEach { weekDay -> println(weekDay) }
}

