package io

fun main(args: Array<String>) {

    println("Welcome to Hangman!")

    print("Enter a word to start the game: ")
    val word : String? = readLine()

    if (word == null) {
        println("Invalid word, Game over!")
        return
    }

    for (i in 0..100) {
        println()
    }

    var misses: Int = 0
    var setOfUniqueCharacters = word.toCharArray().toHashSet()
    var guessedWord = mutableSetOf<Char>()

    for (i in 0..word.length-1) {
        print(" _")
    }

    println()

    while (guessedWord != setOfUniqueCharacters) {
        print("Enter a character : ")
        val char = readLine()
        if (char == null) {
            println("Invalid input")
            break;
        }
        if (!setOfUniqueCharacters.contains(char[0])){
            misses++;
            println("You missed")
            if (misses >= 3) {
                println("Game over!")
                break
            }
        } else {
            guessedWord.add(char[0])

            for (i in 0..word.length-1) {
                val curr = word[i]
                if (guessedWord.contains(curr)) {
                    print(" $curr")
                } else {
                    print(" _")
                }
            }

            println()
        }
    }

    println("__RESULTS__")
    val isWinner: Boolean = guessedWord == setOfUniqueCharacters
    println("Did you win? $isWinner")
    println("# misses = $misses")

}