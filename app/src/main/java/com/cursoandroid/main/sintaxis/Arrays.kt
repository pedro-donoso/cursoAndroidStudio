package com.cursoandroid.main.sintaxis

fun main() {
    //Indice 0-6
    //Tamaño 7
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

 //   println(weekDays[0])
 //   println(weekDays.size)

    //Tamaños
    if (weekDays.size >= 8) {
  //      println(weekDays[7])
    } else {
  //      println("No hay mas valores en el array")
    }

    //Modificar valores
    weekDays[0] = "Feliz lunes"
  //  println(weekDays[0])

    //Bucles
    for(position in weekDays.indices){
       // println("He pasado por aqui $position")
    }

    for((position, value) in weekDays.withIndex()){
        //println("La posicion $position, contiene $value")
    }

    for (weekday in weekDays){
        println("Ahora es $weekday")
    }
}