package com.example.cse225_kotlin_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class DynamicFragmentDataExTwo : Fragment() {
    lateinit var txtData: TextView
     var msg: String = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
       val v: View = inflater.inflate(R.layout.fragment_dynamic_data_ex_two, container, false)
        txtData = v.findViewById(R.id.textView)
        txtData.setText(msg)
        return  v

    }
    fun displayReceivedData(message: String) {
        msg = message
    }


}