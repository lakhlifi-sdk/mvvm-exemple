package com.example.mvvm_exemple.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_exemple.R

class MainActivity : AppCompatActivity() {
    lateinit var personViewModel : PersonViewModel
    lateinit var txt_name : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_name = findViewById(R.id.txt_name)

        personViewModel = ViewModelProvider(this).get(PersonViewModel::class.java)


        personViewModel.mutableLiveData.observe(this, Observer {
            print(it)
            txt_name.text = it.age.toString()
            Log.d("----- it", ""+it.age)

        })


    }

    fun btn_get_fata(view: View) {
        if(view.id == R.id.btn){

        }
    }
}