package org.example

fun main() {
    val w = readln().toInt()
    if (w % 2 == 0 && w >= 4) {
        println("Yes");
    } else {
        println("No");
    }
}