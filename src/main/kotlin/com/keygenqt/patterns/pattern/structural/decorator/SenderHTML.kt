package com.keygenqt.patterns.pattern.structural.decorator

class SenderHTML(wrap: ISender) : SenderDecorator(wrap) {
    override fun send(text: String) {
        super.send("<div>$text</div>")
    }
}