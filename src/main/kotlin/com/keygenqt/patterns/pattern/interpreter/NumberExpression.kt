package com.keygenqt.patterns.pattern.interpreter

// not terminal
class NumberExpression(private val number: Int) : Expression {
    override fun interpret(): Int {
        return number
    }
}