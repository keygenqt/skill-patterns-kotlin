package com.keygenqt.patterns.pattern.factory_method

class CurrencyRUB : Currency {
    override fun iso(): String {
        return "RUB"
    }

    override fun rate(): Double {
        return 76.57
    }
}