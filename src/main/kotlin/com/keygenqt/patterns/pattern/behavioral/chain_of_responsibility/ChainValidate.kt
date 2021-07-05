package com.keygenqt.patterns.pattern.behavioral.chain_of_responsibility

class ChainValidate : HandlerBase() {
    override fun handle(email: String, password: String) {
        if (email.isBlank() || password.isBlank()) {
            throw Exception("Error ChainValidate")
        } else {
            println("ChainValidate successfully")
            super.handle(email, password)
        }
    }
}