package com.example.mvvm_exemple.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm_exemple.models.Person
import com.example.mvvm_exemple.repository.PersonRepo

class PersonViewModel : ViewModel() {

    lateinit var personRepo: PersonRepo

    val mutableLiveData = MutableLiveData<Person>()

    init {
        val person  = getPersonDataBase()
        mutableLiveData.value = person
    }

    fun getPersonDataBase() :  Person {

       personRepo = PersonRepo()
        return personRepo.getPersonDataBase()

    }
}