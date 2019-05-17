package com.example.android.recyclerviewoverview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fm = supportFragmentManager

        fm.beginTransaction()
            .add(R.id.mainActivity_frame,
                RecyclerViewFragment().setShowToastLambda {
                    Toast.makeText(baseContext,
                        "${it.name} by ${it.author}", Toast.LENGTH_LONG).show() }
            ).commit()
    }



}
