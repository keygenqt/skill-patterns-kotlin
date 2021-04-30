package com.keygenqt.patterns.pattern.strategy

class ConcreteStrategyMinis : Strategy {
    override fun execute(x: Int, y: Int): Int {
        return x - y
    }
}