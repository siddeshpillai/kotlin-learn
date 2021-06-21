package oo

fun main(args: Array<String>) {
    val ordersList = mutableListOf<Order>()

    val order1 = Order(1)
    order1.addItem(Noodles())
    ordersList.add(order1)

    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    ordersList.add(order2)

    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    ordersList.add(order3)

    val order4 = Order(4).addItem(Noodles()).addItem(Vegetables("Cabbage", "Onion"))
    ordersList.add(order4)

    ordersList.add(
        Order(5)
            .addItem(Noodles())
            .addItem(Noodles())
            .addItem(Vegetables("Spinach")))

    for (order in ordersList) {
        order.print()
        println()
    }
}

open class Item(val name: String, val price: Double)

class Noodles() : Item("Noodles", 15.0) {
    override fun toString(): String {
        return "Noodles[name=$name, price=$price]"
    }
}

class Vegetables(private vararg val toppings: String) : Item("Veggies", 1.5) {
    override fun toString(): String {
        return if (toppings.isEmpty()) "$name Chef's Choice" else "Vegetables[name=$name, price=$price, toppings=${toppings.joinToString()}]"
    }
}

class Order(val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Order {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order {
        itemList.addAll(newItems)
        return this
    }

    fun print() {
        println("Order #${orderNumber}")
        var total = 0.0
        for (item in itemList) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }
}
