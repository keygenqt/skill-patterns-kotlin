package com.keygenqt.patterns.pattern.mediator

class Window : Mediator {

    val buttonOk = ButtonOk(this)
    val buttonCancel = ButtonCancel(this)

    override fun notify(button: Button, event: String) {
        if (event == "print") {
            when (button) {
                is ButtonOk -> println("ButtonOk print")
                is ButtonCancel -> println("ButtonCancel print")
            }
        } else if (event == "click") {
            when (button) {
                is ButtonOk -> println("ButtonOk click")
                is ButtonCancel -> println("ButtonCancel click")
            }
        }
    }
}