package com.keygenqt.patterns.pattern.creational.factory_method

class CurrencyUSD : Currency {
    override fun iso(): String {
        return "USD"
    }

    override fun rate(): Double {
        return 1.00
    }
}