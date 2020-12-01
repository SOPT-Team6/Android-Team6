package com.example.android_team6

import android.content.Intent
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.KeyEvent.ACTION_DOWN
import android.view.KeyEvent.KEYCODE_ENTER
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_search.*
import kotlinx.android.synthetic.main.fragment_home_.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewpagerAdapter : ViewPagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewpagerAdapter.fragments = listOf(
            Home_Fragment(),
            Shop_Fragment(),
            User_Fragment()
        )

        tab_viewpager.adapter = viewpagerAdapter

        bottom_tab.setupWithViewPager(tab_viewpager)
        bottom_tab.apply {
            getTabAt(0)?.setIcon(R.drawable.ic_home_ic)
            getTabAt(1)?.setIcon(R.drawable.ic_off_shopping_basket_ic)
            getTabAt(2)?.setIcon(R.drawable.ic_off_user_ic)
        }

        tab_viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {}
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {}
            // ViewPager의 페이지 중 하나가 선택된 경우
            override fun onPageSelected(position: Int) {
                bottom_tab.getTabAt(position)?.isSelected
                if(position == 0) {
                    bottom_tab.getTabAt(position)?.setIcon(R.drawable.ic_home_ic)
                    bottom_tab.getTabAt(1)?.setIcon(R.drawable.ic_off_shopping_basket_ic)
                    bottom_tab.getTabAt(2)?.setIcon(R.drawable.ic_off_user_ic)
                }
                else if(position == 1) {
                    bottom_tab.getTabAt(0)?.setIcon(R.drawable.ic_off_home_ic)
                    bottom_tab.getTabAt(position)?.setIcon(R.drawable.ic_shopping_basket_ic)
                    bottom_tab.getTabAt(2)?.setIcon(R.drawable.ic_off_user_ic)
                }
                else {
                    bottom_tab.getTabAt(0)?.setIcon(R.drawable.ic_off_home_ic)
                    bottom_tab.getTabAt(1)?.setIcon(R.drawable.ic_off_shopping_basket_ic)
                    bottom_tab.getTabAt(position)?.setIcon(R.drawable.ic_user_ic)
                }
            }
        })


    }
}