package com.example.group_11_w2019_mad_3125_demo_kotlin.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.group_11_w2019_mad_3125_demo_kotlin.R
import kotlinx.android.synthetic.main.animal_list_item.view.*

class AnimalAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    // Inflates the item views
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_list_item, p0, false))
    }
    // Binds each animal in the ArrayList to a view
    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0?.tvAnimalType?.text = items.get(p1)


     }

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }






}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val tvAnimalType = view.tv_animal_type


}

