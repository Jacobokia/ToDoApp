package com.cobs.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import com.cobs.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myList = binding.myList

        val list = ArrayList<Country>()
        list.add(Country("Uganda", "Kampala"))
        list.add(Country("Kenya", "Nairobi"))
        list.add(Country("Rwanda", "Kigali"))
        list.add(Country("DRC", "Kinshasa"))
        list.add(Country("Tanzania", "Dodoma"))
        list.add(Country("USA", "Washington DC"))
        list.add(Country("Burundi", "Bujumbura"))
        list.add(Country("UK", "London"))
        list.add(Country("Canada", "Montreal"))

        //val countryList = listOf("", "Kenya", "South Sudan", "Rwanda", "DRC", "Tanzania",
       // "USA","Burundi","UK", "Canada")

        val arrayAdapter = CountryAdapter(this, list)
        myList.adapter = arrayAdapter

    }
}