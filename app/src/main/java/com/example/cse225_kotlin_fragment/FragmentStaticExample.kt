package com.example.cse225_kotlin_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class FragmentStaticExample : AppCompatActivity(), OnButtonPressListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_static_example)
    }

    override fun onButtonPressed(msg: String) {
        var obj = supportFragmentManager.findFragmentById(R.id.fragment2) as FragmentStaticTwo
        obj.onFragmentInteraction(msg)
    }
}