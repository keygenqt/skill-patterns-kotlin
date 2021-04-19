package com.keygenqt.patterns.pattern.chain_of_responsibility

interface Handler {
    fun setNext(h: Handler): Handler
    fun handle(email: String, password: String)
}