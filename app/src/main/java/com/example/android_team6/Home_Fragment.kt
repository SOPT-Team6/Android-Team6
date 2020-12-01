package com.example.android_team6

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_search.*
import kotlinx.android.synthetic.main.fragment_home_.*
import kotlinx.android.synthetic.main.reading_list.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Home_Fragment : Fragment() {
    private lateinit var readingAdapter: ReadingAdapter
    private lateinit var newAdapter: NewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        readingAdapter = activity?.let { ReadingAdapter(it) }!!
        reading_rcv.adapter = readingAdapter
        reading_rcv.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)

        readingAdapter.itemClick = object : ReadingAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                val star1:TextView = view.findViewById(R.id.star1)
                val star2:TextView = view.findViewById(R.id.star2)
                val star3:TextView = view.findViewById(R.id.star3)
                val star4:TextView = view.findViewById(R.id.star4)
                val star5:TextView = view.findViewById(R.id.star5)
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

        readingAdapter.data = mutableListOf(
            BookData("백설공주에게 죽음을", "넬레노이 하우스 저"),
            BookData("백설공주에게 죽음을", "넬레노이 하우스 저"),
            BookData("백설공주에게 죽음을", "넬레노이 하우스 저")
        )

        newAdapter = activity?.let { NewAdapter(it) }!!
        new_rcv.adapter = newAdapter
        new_rcv.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)

        newAdapter.data = mutableListOf(
            BookData("백설공주에게 죽음을", "넬레노이 하우스 저"),
            BookData("백설공주에게 죽음을", "넬레노이 하우스 저"),
            BookData("백설공주에게 죽음을", "넬레노이 하우스 저"),
            BookData("백설공주에게 죽음을", "넬레노이 하우스 저"),
            BookData("백설공주에게 죽음을", "넬레노이 하우스 저")
        )

        readingAdapter.notifyDataSetChanged()
        newAdapter.notifyDataSetChanged()

        search_button.setOnClickListener{
            val search_intent= Intent(activity, SearchActivity::class.java)
            startActivity(search_intent)

        }

    }

}