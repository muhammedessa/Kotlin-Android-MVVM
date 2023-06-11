package com.muhammedessa.myapplicationlist

import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.muhammedessa.myapplicationlist.Model.Person

class MyListAdapter(var mCtx:Context, var resource:Int,var items:List<Person>)
    :ArrayAdapter<Person>(mCtx,resource ,items)
{

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater :LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resource,null)
        val imageView : ImageView = view.findViewById(R.id.imageView)
        val textView : TextView = view.findViewById(R.id.textView)
        val textView1 : TextView = view.findViewById(R.id.textView2)

        var person: Person = items[position]

        imageView.setImageDrawable(mCtx.resources.getDrawable(person.image))
        textView.text = person.name
        textView1.text = person.description

        view?.setOnClickListener(){
            Toast.makeText(mCtx,"${person.name}", Toast.LENGTH_SHORT).show()
        }

        return view
    }

}

