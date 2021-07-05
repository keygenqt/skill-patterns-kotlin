package com.keygenqt.patterns.pattern.structural.decorator

class SenderSuccess(wrap: ISender) : SenderDecorator(wrap) {
    fun success() {
        send("Success!!!")
    }
}