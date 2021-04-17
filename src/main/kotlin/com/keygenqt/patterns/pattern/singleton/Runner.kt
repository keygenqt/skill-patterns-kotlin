package com.keygenqt.patterns.pattern.singleton

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        val singleton1 = Singleton.getInstance()
        println("getInstance() 1")
        val singleton2 = Singleton.getInstance()
        println("getInstance() 2")
        val singleton3 = Singleton.getInstance()
        println("getInstance() 3")
        val singleton4 = Singleton.getInstance()
        println("getInstance() 4")
    }
}