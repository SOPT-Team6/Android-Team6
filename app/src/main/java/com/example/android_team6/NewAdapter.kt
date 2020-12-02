package com.example.android_team6

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NewAdapter(private val context: Context) : RecyclerView.Adapter<NewViewHolder>() {
    var data = mutableListOf<NewBookData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.new_book_list, parent, false)
        return NewViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: NewViewHolder, position: Int) {
        holder.onBind(data[position])
    }

}