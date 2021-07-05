package com.keygenqt.patterns.pattern.creational.singleton

class Singleton private constructor() {

    // for check Singleton
    init {
        println("Init Singleton")
    }

    companion object {
        // for save Singleton
        private var instance: Singleton? = null

        // for get Singleton
        fun getInstance(): Singleton {
            return instance?.let { instance } ?: run { instance = Singleton(); instance!! }
        }
    }
}