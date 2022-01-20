package com.example.lib_kt

fun main(){
    var info:String ?= "haha"
    println(info ?: "原来你是null")

    println(info?.let { "[$it]" } ?:"原来你的null啊2")
}