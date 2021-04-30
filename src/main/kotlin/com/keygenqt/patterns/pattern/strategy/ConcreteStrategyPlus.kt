package com.keygenqt.patterns.pattern.strategy

class ConcreteStrategyPlus : Strategy {
    override fun execute(x: Int, y: Int): Int {
        return x + y
    }
}