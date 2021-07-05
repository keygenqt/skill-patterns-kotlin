package com.keygenqt.patterns.pattern.structural.decorator

open class SenderDecorator(private val wrap: ISender) : ISender {
    override fun send(text: String) {
        wrap.send(text)
    }
}