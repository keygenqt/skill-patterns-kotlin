package com.keygenqt.patterns.pattern.behavioral.chain_of_responsibility

abstract class HandlerBase : Handler {

    private var handler: Handler? = null

    override fun setNext(h: Handler): Handler {
        handler = h
        return h
    }

    override fun handle(email: String, password: String) {
        handler?.handle(email, password)
    }
}
