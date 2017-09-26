// Copyright © FunctionalKotlin.com 2017. All rights reserved.

sealed class List<T> {
    class Empty<T> : List<T>()
    class NonEmpty<T>(val head: T, val tail: List<T>) : List<T>()
}