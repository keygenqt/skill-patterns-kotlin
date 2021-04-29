package com.keygenqt.patterns.pattern.iterator

class Iterator<T>(private val list: List<T>) {

    constructor(list: ArrayList<T>) : this(list.toList())

    constructor(list: Array<T>) : this(list.toList())

    private var currentPosition = 0

    fun hasNext(): Boolean {
        return currentPosition < list.size
    }

    fun getNext(): T {
        if (!hasNext()) {
            throw Exception("Not have index $currentPosition.")
        }
        val item = list[currentPosition]
        currentPosition++
        return item
    }

    fun reset() {
        currentPosition = 0
    }
}