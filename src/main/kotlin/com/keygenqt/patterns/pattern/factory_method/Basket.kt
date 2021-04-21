package com.keygenqt.patterns.pattern.factory_method

import java.text.DecimalFormat

abstract class Basket(private val price: Double) {

    abstract fun getCurrency(): Currency

    fun buy() {
        getCurrency().let {
            println("Payment price: ${DecimalFormat("0.00").format((price * it.rate()))} (${it.iso()})")
        }
    }
}