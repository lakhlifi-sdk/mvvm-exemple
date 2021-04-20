package com.example.mvvm_exemple.models

data class Person(val name: String, val age : Int) {
    constructor(name: String): this(name , 0)
}