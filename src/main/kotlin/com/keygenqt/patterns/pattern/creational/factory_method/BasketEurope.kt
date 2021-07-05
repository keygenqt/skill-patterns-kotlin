package com.keygenqt.patterns.pattern.creational.factory_method

class BasketEurope(price: Double) : Basket(price) {
    override fun getCurrency(): Currency {
        return CurrencyEUR()
    }
}