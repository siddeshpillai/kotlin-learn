package collections

fun main(args: Array<String>) {

    listAndSet()
    mapTest()
    lambdas()
    makeWordList()
}

fun listAndSet() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   ${numbers}")
    println("sorted: ${numbers.sorted()}")
    val setOfNumbers = numbers.toSet()
    println("set:    ${setOfNumbers}")
    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,2,1)
    println("$set1 == $set2: ${set1 == set2}")
    println("contains 7: ${setOfNumbers.contains(7)}")
    val union = setOfNumbers.union(set1)
    println("union $union")
    val intersect = setOfNumbers.intersect(set1)
    println("intersect $intersect")
}

fun mapTest() {
    val peopleMap = mutableMapOf<String, Int>(
        "Fred" to 23,
        "Kayla" to 54
    )

    println("map $peopleMap")

    peopleMap.put("Tom", 88)

    println("map $peopleMap")

    println("val ${peopleMap.get("Tom")}")

    peopleMap.put("Kayla", 32)

    println("map $peopleMap")

    peopleMap.forEach{ print("${it.key} is ${it.value}, ") }

    println()

    println( peopleMap.map { "${it.key} is ${it.value}" }.joinToString(", "))

    println()

    val filteredNames = peopleMap.filter { it.key.length < 4 }
    println(filteredNames)

    val res = filteredNames.toList()
    println(res)
}

fun lambdas() {
    val triple: (Int) -> Int = { a: Int -> a * 3 }
    val triple2: (Int) -> Int = { it * 3 }

    println(triple(5))
    println(triple2(3))

    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    println(peopleNames.sortedWith{ str1: String, str2: String -> str1.length - str2.length})
}

fun makeWordList() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")

    // collection of words that starts with letter b
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    println(filteredWords)

    val shuffledWords = filteredWords.shuffled()
    println(shuffledWords)

    val takeTwo = shuffledWords.take(2)
    println(takeTwo)
}