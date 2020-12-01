package com.example.android_team6

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SearchBookAdapter(private val context: Context) : RecyclerView.Adapter<SearchBookViewHolder>() {
    var data = mutableListOf<SearchBookData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchBookViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_search_book, parent, false)
        return SearchBookViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: SearchBookViewHolder, position: Int) {
        holder.onBind(data[position])
    }

}
