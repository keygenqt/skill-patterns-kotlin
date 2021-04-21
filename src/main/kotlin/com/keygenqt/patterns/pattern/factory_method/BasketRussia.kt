package com.keygenqt.patterns.pattern.factory_method

class BasketRussia(price: Double) : Basket(price) {
    override fun getCurrency(): Currency {
        return CurrencyRUB()
    }
}