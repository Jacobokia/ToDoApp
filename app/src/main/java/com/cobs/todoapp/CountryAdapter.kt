package com.cobs.todoapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CountryAdapter(val context: Context, val list:ArrayList<Country>): BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
       return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_layout,null,false)
        val nameView = view.findViewById<TextView>(R.id.country_name)
        val cityView = view.findViewById<TextView>(R.id.city_name)

        nameView.text = list[position].name
        cityView.text = list[position].city

        return view
    }
}