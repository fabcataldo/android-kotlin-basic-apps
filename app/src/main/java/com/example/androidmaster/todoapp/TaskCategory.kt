package com.example.androidmaster.todoapp

//clase sellada
//oye, voy a crear objs
//cuando pinte mi listado de categorias
//va a tener estos objs y nada mas

//isSelected lo van a tener todos los objs, entonces puedo saber de cualquiera
//cual está seleccionado, digamos
sealed class TaskCategory(var isSelected:Boolean = true) {
    object Personal:TaskCategory()
    object Business:TaskCategory()
    object Other:TaskCategory()
}