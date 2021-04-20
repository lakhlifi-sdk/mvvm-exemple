package com.example.mvvm_exemple.repository

import com.example.mvvm_exemple.models.Person

class PersonRepo {


    fun getPersonDataBase() : Person {

        return Person("lakhlifi",23)

    }
}