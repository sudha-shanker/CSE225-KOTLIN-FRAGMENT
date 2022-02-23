package com.example.cse225_kotlin_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout


class FragmentStaticColorTwo : Fragment() {
    private lateinit var parent: LinearLayout
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View {
        val v: View = inflater.inflate(R.layout.fragment_static_color_two, container, false)
        parent = v.findViewById(R.id.frag2parent)
        return v
    }

    fun updateColor(c: Int) {
        parent.setBackgroundColor(c)
    }
}