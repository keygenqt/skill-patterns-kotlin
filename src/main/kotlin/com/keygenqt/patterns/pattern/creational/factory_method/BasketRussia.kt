package com.keygenqt.patterns.pattern.creational.factory_method

class BasketRussia(price: Double) : Basket(price) {
    override fun getCurrency(): Currency {
        return CurrencyRUB()
    }
}