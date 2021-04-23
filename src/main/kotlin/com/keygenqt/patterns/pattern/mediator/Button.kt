package com.keygenqt.patterns.pattern.mediator

abstract class Button(private val mediator: Mediator) {
    fun click() {
        mediator.notify(this, "click")
    }

    fun print() {
        mediator.notify(this, "print")
    }
}