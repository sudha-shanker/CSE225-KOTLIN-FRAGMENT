package com.example.cse225_kotlin_fragment

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FragmentStaticColorExample : AppCompatActivity(),FragmentColorInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_static_color_example)
    }
    fun changeColor(v: View) {
        val fragment2 = supportFragmentManager
            .findFragmentByTag("frag2") as FragmentStaticColorTwo
        fragment2.updateColor(Color.RED)
    }

    override fun newColor(color: Int) {
        val fragment2 = supportFragmentManager
            .findFragmentByTag("frag2") as FragmentStaticColorTwo
        fragment2.updateColor(color)
    }

}