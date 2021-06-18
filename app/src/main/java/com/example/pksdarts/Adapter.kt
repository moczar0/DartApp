package com.example.pksdarts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

    //działanie wewnątrz bazy danych

    class Adapter(private val dataArray: ArrayList<DataBase>): RecyclerView.Adapter<Adapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, ViewType: Int): MyViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.fragment_konto, parent, attachToRoot: false)
        return MyViewHolder(view)

    }

    override fun getItemCount() : Int {
        return dataArray.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.login.text = dataArray[holder.adapterPosition].login1)
        holder.haslo.text = dataArray[holder.adapterPosition].haslo1)
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val login = view.findViewById(R.id.login) as TextView
        val haslo = view.findViewById(R.id.haslo) as TextView
    }
}