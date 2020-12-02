package com.example.android_team6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity() {
    private lateinit var searchbookAdapter:SearchBookAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)


        searchbookAdapter=SearchBookAdapter(this)
        search_book_rcv.adapter=searchbookAdapter
        search_book_rcv.layoutManager= LinearLayoutManager(this)

        searchbookAdapter.data=mutableListOf(
            SearchBookData(
                "E-Book",
                "백설공주에게 죽음을",
                "넬레노이 하우스 저",
                "‘백설공주에게 죽음을’은 넬레노이 하우스의 베스트셀러 작품으로써 많은 사람들에게 큰 사랑을 받고 있다.(총46자)"
            ),
            SearchBookData(
                "E-Book",
                "여우가 잠든 숲2",
                "넬레노이 하우스 저",
                "넬레노이 하우스만의 새로운 대표작인 여우가 잠든 숲2, 새하얀 안개가 피우던 날 갑자기 사라진 소년과 소녀는...(총46자)"
            )
        )

        searchbookAdapter.notifyDataSetChanged()

        /* after에 넣었을때도 왜 치는동안 반응하는건지?*/
        searchbar.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(searchtext: Editable?) {
                if(searchbar.text.length==0){
                    search_popular.visibility= View.VISIBLE
                }
            }

            override fun beforeTextChanged(searchtext: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(searchtext: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //val search_text=searchbar.text
            }
        })
        /**/

        searchbar.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            //Enter key Action
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                search_popular.visibility = View.INVISIBLE
                true
            } else {
                false
            }
        })

        //<-눌렀을때 intent
        back_btn.setOnClickListener{
            val back_intent= Intent(this, MainActivity::class.java)
            startActivity(back_intent)

        }

    }
}