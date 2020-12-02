package com.example.android_team6

import android.content.Intent
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class NewViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val new_book_list = itemView.findViewById<ImageView>(R.id.book_list)

    fun onBind(newbookdata : NewBookData) {
        Glide.with(itemView).load(newbookdata.img_newbook).into(new_book_list)

        new_book_list.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val detailIntent = Intent(v!!.context, DetailBookActivity::class.java)
                moveActi(detailIntent, v)
            }
        })
    }
}