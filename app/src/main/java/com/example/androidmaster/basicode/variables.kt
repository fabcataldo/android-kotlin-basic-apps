package com.example.androidmaster.basicode

fun main() {
//    val name = "pepe"
//    val age:Int = 30
//    getMonth(15)
    var days = arrayOf("lunnes", "martes")

//    for(position in days.indices){
//        println("pepe $position")
//        println(days[position])
//    }

//    for((position, value) in days.withIndex()){
//        println(position)
//        println(value)
//    }

//    for(day in days){
//        println(day)
//    }

    val readOnlyList:List<String> = listOf("lunes", "martes")
    println("LISTOF de readonlylist")
    println(readOnlyList.size)
    val example = readOnlyList.filter { it.contains("lunes") }
    println("filter de readonlylist")
    println(example)

    println("foreach de readonlylist")
    readOnlyList.forEach { weekDay -> println(weekDay) }

    println()
    mutableList()
}

fun getMonth(month: Int){
    when(month) {
        in 1 .. 3 -> {
            println("primer trimestre")
        }
        in 4 .. 6 -> {
            println("2do trimestre")
        }
        else -> println("no existe mes")
    }
}

fun mutableList() {
    println("mutable list func weekDays mutablelist nuevo")
    var weekDays:MutableList<String> = mutableListOf("mutable lunes", "mutable martes")
    println(weekDays)
    weekDays.add("nuevo diaaaaa")
    println(weekDays)
    weekDays.add(2, "eee nuevo dia colado")
    println(weekDays)

    if(weekDays.isEmpty()){
        //no voy a pintar nada porque no hay nothing
    } else {
        weekDays.forEach{ println(it) }
    }

    if(weekDays.isNotEmpty()){
        println("NO ESTA VACIO")
    }

    weekDays.last()
}