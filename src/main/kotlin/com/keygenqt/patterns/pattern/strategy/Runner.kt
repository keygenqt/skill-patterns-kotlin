package com.keygenqt.patterns.pattern.strategy

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        val context = Context()
        when ((1..2).random()) {
            1 -> context.strategy = ConcreteStrategyMinis()
            2 -> context.strategy = ConcreteStrategyPlus()
        }
        println("Strategy: ${context.strategy?.javaClass?.simpleName}")
        println("Result: ${context.execute(1, 1)}")
    }
}