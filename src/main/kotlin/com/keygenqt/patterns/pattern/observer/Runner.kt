package com.keygenqt.patterns.pattern.observer

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        val observer = ConcreteObserver(object : Observer {
            override fun update(message: String) {
                println(message)
            }
        })

        observer.messageOneSeconds()
        observer.messageTwoSeconds()

        // keep app
        Thread.sleep(2500L)

        println("------------------")

        val observer2 = ConcreteObserverUnit {
            println(it)
        }

        observer2.messageOneSeconds()
        observer2.messageTwoSeconds()

        // keep app
        Thread.sleep(2500L)
    }
}