package com.example.android_team6

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SearchBookViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
    private val kind: TextView =itemView.findViewById(R.id.book_kind) //바인딩시킴.
    private val name: TextView =itemView.findViewById(R.id.book_name)
    private val author: TextView =itemView.findViewById(R.id.book_author)
    private val story: TextView =itemView.findViewById(R.id.book_story)

    fun onBind(data: SearchBookData) {
        kind.text = data.kind
        name.text = data.name
        author.text=data.author
        story.text=data.story

    }

}