package com.keygenqt.patterns.pattern.factory_method

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        val priceUSD = 5.00
        listOf(BasketEurope(priceUSD), BasketRussia(priceUSD), BasketUSA(priceUSD)).random().buy()
    }
}