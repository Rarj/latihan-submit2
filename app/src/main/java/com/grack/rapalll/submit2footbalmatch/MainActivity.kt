package com.grack.rapalll.submit2footbalmatch

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.appcompat.R.attr.colorAccent
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.experimental.selects.select
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.support.v4.swipeRefreshLayout
import android.R.attr.fragment
import android.widget.Toast


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        val id = p0.itemId
        when (id) {
            R.id.next_match -> Toast.makeText(this, "NEXT", Toast.LENGTH_SHORT).show()
            R.id.past_match -> Toast.makeText(this, "PAST", Toast.LENGTH_SHORT).show()
        }
        return true
    }


    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = navigation

        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }
}
//
//            val menu : Menu = navigation.menu
//            selectedMenu(menu.getItem(0))
//            navigation.setOnNavigationItemSelectedListener {
//                item: MenuItem ->  selectedMenu(item)
//
//                false
//            }
//
//        }

//    private fun selectedMenu(item : MenuItem) {
//        item.isChecked = true
//        when(item.itemId) {
//            R.id.next_match -> selectedFragment(NextMatchFragment.getInstance())
//            R.id.past_match -> selectedFragment(PastMatchFragment.getInstance())
//        }
//    }

//        fun selectedFragment(fragment: Fragment?) {
//            val transaction: FragmentTransaction? = supportFragmentManager.beginTransaction()
//            transaction?.replace(R.id.frame_container, fragment!!)
//            transaction?.commit()
//        }
//    }
//}
