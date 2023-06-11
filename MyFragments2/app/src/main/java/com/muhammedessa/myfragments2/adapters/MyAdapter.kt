package com.muhammedessa.myfragments2.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.muhammedessa.myfragments2.Fragment1
import com.muhammedessa.myfragments2.Fragment2
import com.muhammedessa.myfragments2.Fragment3
import com.muhammedessa.myfragments2.MainActivity

//class MyAdapter(mainActivity: MainActivity): FragmentStateAdapter(mainActivity) {

class MyAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle):
    FragmentStateAdapter(fragmentManager,lifecycle ) {

    private val fragmentSize = 3
    override fun getItemCount(): Int {
        return this.fragmentSize
    }

    override fun createFragment(position: Int): Fragment {
       when(position){
//           0 ->{
//               return  Fragment1()
//           }
           1 ->{
               return  Fragment2()
           }
           2 ->{
               return  Fragment3()
           }
       }
        return  Fragment1()
    }
}