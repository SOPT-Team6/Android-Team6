package com.example.android_team6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_book.*

class DetailBookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_book)

        back_btn1.setOnClickListener{
            val back_intent= Intent(this, MainActivity::class.java)
            startActivity(back_intent)

        }
    }
}