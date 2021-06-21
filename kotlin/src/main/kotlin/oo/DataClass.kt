package oo

class Books(val title: String, val author: String, val price: Int) {
    override fun toString() : String {
        return "Book[title:$title, author:$title, price:$price]"
    }
}

data class DataBook(val title: String, val author: String, val price: Int)

fun main(args: Array<String>) {
    val book1 = Books("Super Book", "Super man", 99)
    val book2 = Books("Super Book", "Super man", 99)


    val dataBook1 = DataBook("Super Book", "Super man", 99)
    val dataBook2 = DataBook("Super Book", "Super man", 99)

    println(book1)
    println(book1.equals(book2))

    println(dataBook1)
    println(dataBook1.equals(dataBook2))

    val dataBook3 = dataBook2.copy()
    println("dataBook3 $dataBook3")

    val dataBook4 = dataBook3.copy(price = 59)
    println("dataBook4 $dataBook4")
}
