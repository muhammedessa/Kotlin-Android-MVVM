package com.muhammedessa.myfragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast


class Fragment1 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(context,"onAttach",Toast.LENGTH_SHORT).show()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(context,"onCreateView",Toast.LENGTH_SHORT).show()
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false)

    }

    override fun onStart() {
        Toast.makeText(context,"onCreateView",Toast.LENGTH_SHORT).show()
        super.onStart()
    }

    override fun onPause() {
        Toast.makeText(context,"onPause",Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onResume() {
        Toast.makeText(context,"onResume",Toast.LENGTH_SHORT).show()
        super.onResume()
    }

    override fun onStop() {
        Toast.makeText(context,"onStop",Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onDestroyView() {
        Toast.makeText(context,"onDestroyView",Toast.LENGTH_SHORT).show()
        super.onDestroyView()
    }

    override fun onDetach() {
        Toast.makeText(context,"onDetach",Toast.LENGTH_SHORT).show()
        super.onDetach()
    }

    override fun onDestroy() {
        Toast.makeText(context,"onDestroy",Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }




}