package com.keygenqt.patterns.pattern.chain_of_responsibility

class ChainLogin : HandlerBase() {
    override fun handle(email: String, password: String) {
        if (email != "test@gmail.com" || password != "1234") {
            throw Exception("Error ChainLogin")
        } else {
            println("ChainLogin successfully")
            super.handle(email, password)
        }
    }
}