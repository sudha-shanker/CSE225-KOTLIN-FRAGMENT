package com.example.cse225_kotlin_fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class DynamicFragmentDataExample : AppCompatActivity(),OnDataListener {
     var sendData = ""
     var senddata2 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_fragment_data_example)

        val fm: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fm.beginTransaction()

        if (savedInstanceState != null) {
            senddata2 = savedInstanceState.getString("K1")!!
        } // get the display mode

        val displaymode = resources.configuration.orientation
        if (displaymode == 1) { // it portrait mode
            val f1 = DynamicFragmentDataExOne()
            fragmentTransaction.replace(android.R.id.content, f1)
        } else { // its landscape
            val f2 = DynamicFragmentDataExTwo()
            fragmentTransaction.replace(android.R.id.content, f2)
            //if (senddata2 != null) {
                f2.displayReceivedData(senddata2)
            //}

        }
        fragmentTransaction.commit()
    }

    override fun communicate(msg: String) {
        sendData = msg
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("K1", sendData)
    }
}