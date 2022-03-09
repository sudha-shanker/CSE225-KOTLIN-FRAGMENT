package com.example.cse225_kotlin_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView


class StaticFragListExOne : Fragment() {
    var AndroidOS = arrayOf(
        "Cupcake",
        "Donut",
        "Eclair",
        "Froyo",
        "Gingerbread",
        "Honeycomb",
        "Ice Cream SandWich",
        "Jelly Bean",
        "KitKat",
        "LolliPop",
        "MarshMallow",
        "Nougat",
        "Oreo"
    )
    lateinit  var lv: ListView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_static_frag_list_ex_one, container, false)
        lv = view.findViewById(R.id.lst) as ListView
        val arrayAdapter = ArrayAdapter(requireActivity(),android.R.layout.simple_list_item_1,AndroidOS)
        lv.setAdapter(arrayAdapter)
        lv.setOnItemClickListener { adapterView, view, i, l ->
            val txtfrag = parentFragmentManager.findFragmentById(R.id.fragment2) as StaticFragListExTwo
            txtfrag.change("Android OS:- "+AndroidOS[i])
            lv.setSelector(R.color.purple_200)
        }
        return view
    }

      }
