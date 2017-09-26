// Copyright © FunctionalKotlin.com 2017. All rights reserved.

sealed class List<T> {
    class Empty<T> : List<T>()
    class NonEmpty<T>(val head: T, val tail: List<T>) : List<T>()
}

fun totalCost(items: List<Int>): Int =
    when(items) {
        is List.Empty -> 0
        is List.NonEmpty -> items.head + totalCost(items.tail)
    }

fun main(args: Array<String>) {
    val cart = List.NonEmpty(
        4, List.NonEmpty(
            5, List.NonEmpty(
                7, List.NonEmpty(
                    83, List.NonEmpty(
                        3, List.NonEmpty(
                            4, List.Empty()))))))

    println(totalCost(cart))
}