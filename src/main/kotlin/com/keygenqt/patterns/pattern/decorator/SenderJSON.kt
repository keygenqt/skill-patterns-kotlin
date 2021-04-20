package com.keygenqt.patterns.pattern.decorator

class SenderJSON(wrap: ISender) : SenderDecorator(wrap) {
    override fun send(text: String) {
        super.send("{send: '$text'}")
    }
}