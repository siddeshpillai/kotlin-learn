fun main(args: Array<String>) {
    println("Hello World!")

    val numbers = listOf(1,3,4,7,9)
    println(numbers)
    println(reverseList(numbers))
    println(reverseList2(numbers))
}

fun reverseList(list: List<Int>) : List<Int> {
    var result = arrayListOf<Int>()

    for ( i in 0..list.size-1) {
        result.add(list[list.size-1-i])
    }

    return result
}

fun reverseList2(list: List<Int>) : List<Int> {
    val result = arrayListOf<Int>()

    for ( i in list.size-1 downTo 0) {
        result.add(list.get(i))
    }

    return result
}
