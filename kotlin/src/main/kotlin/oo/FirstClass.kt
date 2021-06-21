package oo

class FirstClass (val name: String, var age: Int) {
    private val birthYear : Int = 2021 - age

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println ("Hello, $name")
    }

    fun getYearOfBirth() = birthYear
}

fun main(args: Array<String>) {
//    val person = FirstClass("Peter", 23)
//    println ("Person name ${person.name} is aged ${person.age}")
//    person.speak()
//    person.greet("Tom")
//    println(person.getYearOfBirth())

    val book = Book("Yes Sir", "Sid", 2021)
    book.printBookDetails()

    if (!book.isBookBorrowed()) {
        book.borrowNow()
    }

    book.printBookDetails()

    if (book.isBookBorrowed()) {
        book.returnNow()
    }

    book.printBookDetails()

}