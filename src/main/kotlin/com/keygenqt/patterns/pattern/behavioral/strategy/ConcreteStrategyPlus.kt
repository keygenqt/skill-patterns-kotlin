package com.keygenqt.patterns.pattern.behavioral.strategy

class ConcreteStrategyPlus : Strategy {
    override fun execute(x: Int, y: Int): Int {
        return x + y
    }
}