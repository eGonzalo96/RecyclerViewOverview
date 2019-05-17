package com.example.android.recyclerviewoverview

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import kotlinx.android.synthetic.main.activity_main_fragment.*
import kotlinx.android.synthetic.main.activity_main_fragment.view.*

class RecyclerViewFragment: Fragment() {

    lateinit var showToast: (Book) -> Unit
    val bookAdapter = BookAdapter { showToast(it) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.activity_main_fragment, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        view.recyclerView.layoutManager = LinearLayoutManager(view.context)
        view.recyclerView.adapter = bookAdapter
        bookAdapter.submitList(setOfBooks)

    }


    fun setShowToastLambda(lambda: (Book) -> Unit) : RecyclerViewFragment {
        showToast = lambda
        return this
    }
}