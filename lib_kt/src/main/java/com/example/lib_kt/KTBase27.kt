package com.example.lib_kt

fun main(){
    val str = "ABCDEFGHIJKLMN"

    val r: String = str.also{
        true
    }

    println(r)


    str.also{
        println("$it")
    }.also {
        println("${it.toLowerCase()}")
    }
}