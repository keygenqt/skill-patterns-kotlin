package com.keygenqt.patterns.pattern.structural.decorator

class Sender : ISender {
    override fun send(text: String) {
        println(text)
    }
}