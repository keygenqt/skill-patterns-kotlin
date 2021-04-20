package com.keygenqt.patterns.pattern.composite

class CompoundBasket : Product {
    private val history = mutableListOf<Product>()

    fun add(product: Product) {
        history.add(product)
    }

    fun remove(product: Product) {
        history.remove(product)
    }

    override fun buy() {
        if (history.filterIsInstance<CompoundBasket>().isEmpty()) {
            println("\n-------------- CompoundBasket")
        }
        history.forEach {
            it.buy()
        }
    }
}