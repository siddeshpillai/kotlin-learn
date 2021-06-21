package oo

interface Lendable {
    fun borrow() {
        println("borrow Lendable")
    }
}

abstract class InventoryItem(val title: String, val genre: String, val publicationYear: Int) : Lendable {

    override fun borrow() {
        super.borrow()
        println("borrow InventoryItem")
    }

    override fun toString(): String {
        return "InventoryItem[title:$title, genre:$genre, publicationYear:$publicationYear]"
    }
}

class Notebook(title: String, val author: String, genre: String, publicationYear: Int) : InventoryItem(title, genre, publicationYear) {

    override fun borrow() {
        super.borrow()
        println("borrow Notebook")
    }
}

class DVD(title: String, val length: Int, genre: String, publicationYear: Int) : InventoryItem(title, genre, publicationYear) {

    override fun borrow() {
        super.borrow()
        println("borrow DVD")
    }
}

fun main(args: Array<String>) {
    val notebook = Notebook("Super Human", "Sid", "Thriller", 2021)
    println(notebook)
    notebook.borrow()

    val dvd = DVD("Mozart", 180, "Musical", 1905)
    println(dvd)
    dvd.borrow()
}