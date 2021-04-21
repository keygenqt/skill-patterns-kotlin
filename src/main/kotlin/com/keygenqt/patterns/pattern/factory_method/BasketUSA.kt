package com.keygenqt.patterns.pattern.factory_method

class BasketUSA(price: Double) : Basket(price) {
    override fun getCurrency(): Currency {
        return CurrencyUSD()
    }
}