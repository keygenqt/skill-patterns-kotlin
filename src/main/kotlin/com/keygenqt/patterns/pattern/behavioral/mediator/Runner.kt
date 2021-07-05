package com.keygenqt.patterns.pattern.behavioral.mediator

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        val window = Window()

        window.buttonOk.click()
        window.buttonOk.print()

        window.buttonCancel.click()
        window.buttonCancel.print()
    }
}