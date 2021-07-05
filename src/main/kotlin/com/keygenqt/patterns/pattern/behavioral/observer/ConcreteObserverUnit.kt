package com.keygenqt.patterns.pattern.behavioral.observer

import java.util.*
import kotlin.concurrent.schedule

class ConcreteObserverUnit(private val listener: (message: String) -> Unit) {
    fun messageOneSeconds() {
        Timer().schedule(1000) {
            listener.invoke("Message one second")
        }
    }

    fun messageTwoSeconds() {
        Timer().schedule(2000) {
            listener.invoke("Message two second")
        }
    }
}