package com.keygenqt.patterns.pattern.decorator

class SenderHTML(wrap: ISender) : SenderDecorator(wrap) {
    override fun send(text: String) {
        super.send("<div>$text</div>")
    }
}