package com.example.android.recyclerviewoverview

import android.support.v7.util.DiffUtil

data class Book(
    val author: String,
    val name: String
) {

    companion object {
        val diffCallback = object : DiffUtil.ItemCallback<Book>() {
            override fun areItemsTheSame(p0: Book, p1: Book): Boolean =
                p0 == p1

            override fun areContentsTheSame(p0: Book, p1: Book): Boolean =
                (p0.author == p1.author) && (p0.name == p1.name)
        }
    }

}


val setOfBooks = arrayListOf(
    Book("Juan Rulfo", "El Llano En Llamas"),
    Book("GEB", "Douglass Hofstadter"),
    Book("Octavio Paz", "Libertad Bajo Palabra"),
    Book("William Faulkner", "El Ruido Y La Furia"),
    Book("Lolita", "Vladimir Nabokov")
)