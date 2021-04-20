package com.keygenqt.patterns.pattern.decorator

class SenderSuccess(wrap: ISender) : SenderDecorator(wrap) {
    fun success() {
        send("Success!!!")
    }
}