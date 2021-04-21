package com.keygenqt.patterns.pattern.factory_method

class BasketEurope(price: Double) : Basket(price) {
    override fun getCurrency(): Currency {
        return CurrencyEUR()
    }
}