package org.example

fun converToAlphabet(n: Int): String {
    var number = n
    val result = StringBuilder()

    while (number > 0) {
        number--
        val char = 'A' + (number % 26)
        result.append(char)
        number /= 26
    }

    return result.reverse().toString()
}

fun converToNumber(s: String): Int {
    var result = 0
    for (ch in s) {
        result = result * 26 + (ch - 'A' + 1)
    }

    return result
}

fun main() {
    val n = readln().toInt()
    val regex = Regex("^R([1-9]\\d{0,6})C([1-9]\\d{0,6})$")
    repeat(n) {
        val cell = readln()
        val match = regex.find(cell)
        if (match != null) {
            val row = match.groupValues[1].toInt()
            val column = match.groupValues[2].toInt()
            val columnString = converToAlphabet(column)
            println("$columnString$row")
        } else {
            var row = StringBuilder()
            val column = StringBuilder()

            for (char in cell) {
                if (char.isLetter()) {
                    column.append(char)
                } else {
                    row.append(char)
                }
            }
            val columnNumber = converToNumber(column.toString())
            println("R${row}C${columnNumber}")
        }
    }
}