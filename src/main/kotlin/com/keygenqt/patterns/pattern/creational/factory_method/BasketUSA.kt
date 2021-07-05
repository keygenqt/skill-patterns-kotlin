package com.keygenqt.patterns.pattern.creational.factory_method

class BasketUSA(price: Double) : Basket(price) {
    override fun getCurrency(): Currency {
        return CurrencyUSD()
    }
}