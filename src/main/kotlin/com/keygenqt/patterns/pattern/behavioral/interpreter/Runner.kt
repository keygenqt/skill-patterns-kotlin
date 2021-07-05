package com.keygenqt.patterns.pattern.behavioral.interpreter

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        val expression = "1-1-1-1-1"

        Context().evaluate(expression)?.let {
            println("Result: ${it.interpret()}")
        }
    }
}









