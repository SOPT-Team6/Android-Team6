package com.example.android_team6

import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.reading_list.*

class SampleViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
    private val title: TextView = itemView.findViewById(R.id.book_title)
    private val subTitle: TextView = itemView.findViewById(R.id.book_author)
    private val list_container = itemView.findViewById<ConstraintLayout>(R.id.list_container)

    fun onBind(data : BookData) {
        title.text = data.book_title
        subTitle.text = data.book_author

        list_container.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                val detailIntent = Intent(v!!.context, DetailBookActivity::class.java)
                moveActi(detailIntent, v)
            }
        })
    }


    override fun onClick(v: View?) {
        val star1:TextView = itemView.findViewById(R.id.star1)
        val star2:TextView = itemView.findViewById(R.id.star2)
        val star3:TextView = itemView.findViewById(R.id.star3)
        val star4:TextView = itemView.findViewById(R.id.star4)
        val star5:TextView = itemView.findViewById(R.id.star5)
        star1.setOnClickListener{
            star1.setBackgroundResource(R.drawable.ic_on_star_bt)
            star2.setBackgroundResource(R.drawable.ic_off_star_bt)
            star3.setBackgroundResource(R.drawable.ic_off_star_bt)
            star4.setBackgroundResource(R.drawable.ic_off_star_bt)
            star5.setBackgroundResource(R.drawable.ic_off_star_bt)
        }
        star2.setOnClickListener{
            star1.setBackgroundResource(R.drawable.ic_on_star_bt)
            star2.setBackgroundResource(R.drawable.ic_on_star_bt)
            star3.setBackgroundResource(R.drawable.ic_off_star_bt)
            star4.setBackgroundResource(R.drawable.ic_off_star_bt)
            star5.setBackgroundResource(R.drawable.ic_off_star_bt)
        }
        star3.setOnClickListener{
            star1.setBackgroundResource(R.drawable.ic_on_star_bt)
            star2.setBackgroundResource(R.drawable.ic_on_star_bt)
            star3.setBackgroundResource(R.drawable.ic_on_star_bt)
            star4.setBackgroundResource(R.drawable.ic_off_star_bt)
            star5.setBackgroundResource(R.drawable.ic_off_star_bt)
        }
        star4.setOnClickListener{
            star1.setBackgroundResource(R.drawable.ic_on_star_bt)
            star2.setBackgroundResource(R.drawable.ic_on_star_bt)
            star3.setBackgroundResource(R.drawable.ic_on_star_bt)
            star4.setBackgroundResource(R.drawable.ic_on_star_bt)
            star5.setBackgroundResource(R.drawable.ic_off_star_bt)
        }
        star5.setOnClickListener{
            star1.setBackgroundResource(R.drawable.ic_on_star_bt)
            star2.setBackgroundResource(R.drawable.ic_on_star_bt)
            star3.setBackgroundResource(R.drawable.ic_on_star_bt)
            star4.setBackgroundResource(R.drawable.ic_on_star_bt)
            star5.setBackgroundResource(R.drawable.ic_on_star_bt)
        }
    }

}