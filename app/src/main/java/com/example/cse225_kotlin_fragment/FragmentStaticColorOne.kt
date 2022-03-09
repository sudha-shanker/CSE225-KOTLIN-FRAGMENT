package com.example.cse225_kotlin_fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FragmentStaticColorOne : Fragment() {
    lateinit var btnGreen: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View
    {
        val v: View = inflater.inflate(R.layout.fragment_static_color_one, container, false)
        btnGreen = v.findViewById(R.id.frag1BtnGreen)
        btnGreen.setOnClickListener{
            val mai = activity as FragmentStaticColorExample
            mai.newColor(Color.GREEN)
        }
        return v
    }
}