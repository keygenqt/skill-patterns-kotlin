package com.keygenqt.patterns.pattern.command

class QueryHistory {
    private val history = mutableListOf<Query>()

    fun push(c: Query) {
        history.add(c)
    }

    @ExperimentalStdlibApi
    fun pop(): Query? {
        return history.removeLastOrNull()
    }

    fun showStack() {
        history.forEach {
            println("Name query: ${it.name()}")
        }
    }
}