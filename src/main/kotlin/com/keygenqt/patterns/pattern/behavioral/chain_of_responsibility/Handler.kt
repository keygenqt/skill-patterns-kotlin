package com.keygenqt.patterns.pattern.behavioral.chain_of_responsibility

interface Handler {
    fun setNext(h: Handler): Handler
    fun handle(email: String, password: String)
}