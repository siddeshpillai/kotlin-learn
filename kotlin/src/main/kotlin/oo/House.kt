package oo

class House(val yearBuilt: Int, val price: Int) {

    fun details() {
        println("House [yearBuilt:$yearBuilt, price:$price]")
    }
}

fun main(args: Array<String>) {
    val house1 = House(price=10000000, yearBuilt = 1978)
    val house2 = House(2002, 150000)

    house1.details()
    house2.details()
}