package com.example.android.recyclerviewoverview

import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_recyclerview_items.view.*


class BookAdapter(
    val showBookInfo: (Book) -> Unit) :
    ListAdapter<Book, BookAdapter.BookViewHolder>(Book.diffCallback) {



    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): BookViewHolder {
        val rootView = LayoutInflater
            .from(p0.context)
            .inflate(R.layout.fragment_recyclerview_items, p0, false)

        return BookViewHolder(rootView)
    }


    override fun onBindViewHolder(p0: BookViewHolder, p1: Int) {
        p0.bind(getItem(p1))
    }


    inner class BookViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(book: Book) {
            view.authorName.text = book.author
            view.bookName.text = book.name

            view.setOnClickListener {
                showBookInfo(book)
            }
        }

    }

}