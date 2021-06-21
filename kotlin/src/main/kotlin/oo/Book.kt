package oo

class Book (val title: String, val author: String, val publicationYear: Int) {

    private var isBorrowed:Boolean

    init {
        isBorrowed = false
    }

    fun isBookBorrowed() : Boolean = isBorrowed

    fun borrowNow() {
        isBorrowed = true
    }

    fun returnNow() {
        isBorrowed = false
    }

    fun printBookDetails() {
        println("Title $title")
        println("Author $author")
        println("Published Year $publicationYear")
        println("Available ${!isBookBorrowed()}")
        println()
    }
}