package com.keygenqt.patterns.pattern.composite

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {

        // one level basket
        val basket1 = CompoundBasket().apply {
            add(ProductNotebook())
            add(ProductPC())
            add(ProductPhone())
        }

        // one level basket
        val basket2 = CompoundBasket().apply {
            add(ProductNotebook())
            add(ProductPC())
            add(ProductPhone())
        }

        // second level basket
        CompoundBasket().apply {
            add(basket1)
            add(basket2)
        }.buy()
    }
}