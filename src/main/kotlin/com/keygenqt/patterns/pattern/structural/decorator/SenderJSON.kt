package com.keygenqt.patterns.pattern.structural.decorator

class SenderJSON(wrap: ISender) : SenderDecorator(wrap) {
    override fun send(text: String) {
        super.send("{send: '$text'}")
    }
}