fun day1(input: String): Int {
    var inputWithoutLetters = removeLettersFrom(input)
    val digitLines = inputWithoutLetters.split("\n")
    val numbers = firstAndLastDigitToIntOfEachLine(digitLines)
    return sumOf(numbers)
}

private fun removeLettersFrom(string: String): String {
    var withoutLetters = ""
    for (char in string) {
        if (!char.isLetter()) {
            withoutLetters += char
        }
    }
    return withoutLetters
}

private fun firstAndLastDigitToIntOfEachLine(digitLines: List<String>): List<Int> {
    val numbers = mutableListOf<Int>()
    for (digitLine in digitLines) {
        val numberOfThisLine = "${digitLine.first()}${digitLine.last()}".toInt()
        numbers.add(numberOfThisLine)
    }
    return numbers
}

private fun sumOf(numbers: List<Int>): Int {
    var totalSum = 0
    for (number in numbers) {
        totalSum += number
    }
    return totalSum
}
