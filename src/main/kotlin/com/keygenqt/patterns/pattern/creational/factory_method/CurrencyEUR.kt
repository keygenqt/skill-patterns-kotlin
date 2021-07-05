package com.keygenqt.patterns.pattern.creational.factory_method

class CurrencyEUR : Currency {
    override fun iso(): String {
        return "EUR"
    }

    override fun rate(): Double {
        return 0.83
    }
}