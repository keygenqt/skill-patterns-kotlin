package com.keygenqt.patterns.pattern.observer

import java.util.*
import kotlin.concurrent.schedule

class ConcreteObserver(private val listener: Observer) {
    fun messageOneSeconds() {
        Timer().schedule(1000) {
            listener.update("Message one second")
        }
    }

    fun messageTwoSeconds() {
        Timer().schedule(2000) {
            listener.update("Message two second")
        }
    }
}