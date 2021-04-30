package com.keygenqt.patterns.pattern.strategy

class Context(var strategy: Strategy? = null) {
    fun execute(x: Int, y: Int): Int {
        return strategy?.execute(x, y) ?: 0
    }
}