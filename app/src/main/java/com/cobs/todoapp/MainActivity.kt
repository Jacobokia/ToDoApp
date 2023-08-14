package com.cobs.todoapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.TextView
import com.cobs.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myList = binding.myList

//        val list = ArrayList<Country>()
//        list.add(Country("Uganda", "Kampala"))
//        list.add(Country("Kenya", "Nairobi"))
//        list.add(Country("Rwanda", "Kigali"))
//        list.add(Country("DRC", "Kinshasa"))
//        list.add(Country("Tanzania", "Dodoma"))
//        list.add(Country("USA", "Washington DC"))
//        list.add(Country("Burundi", "Bujumbura"))
//        list.add(Country("UK", "London"))
//        list.add(Country("Canada", "Montreal"))

        val countryList = listOf("", "Kenya", "South Sudan", "Rwanda", "DRC", "Tanzania",
      "USA","Burundi","UK", "Canada")
        val cityList = listOf("Nairobi", "Juba", "Kigali", "Kinshasa", "Dodoma", "Washington",
        "Bujumbura", "London", "Montreal")
     val arrayAdapter = NewAdapter(this, countryList, cityList)
       myList.adapter = arrayAdapter

    }

    class NewAdapter(context: Context,val countryList: List<String>,val cityList: List<String>):ArrayAdapter<String>(context,R.layout.list_item_layout, R.id.country_name, countryList){
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val view = super.getView(position, convertView, parent)

            val countryName = view.findViewById<TextView>(R.id.country_name)
            val cityName = view.findViewById<TextView>(R.id.city_name)
            countryName.text = countryList[position]
            cityName.text = cityList[position]
            return view
        }
    }
}