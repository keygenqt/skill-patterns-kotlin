package com.keygenqt.patterns.pattern.decorator

class Sender : ISender {
    override fun send(text: String) {
        println(text)
    }
}