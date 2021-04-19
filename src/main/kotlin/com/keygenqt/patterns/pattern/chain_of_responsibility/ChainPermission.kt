package com.keygenqt.patterns.pattern.chain_of_responsibility

class ChainPermission : HandlerBase() {
    override fun handle(email: String, password: String) {
        if (!isAdmin(email, password)) {
            throw Exception("Error ChainPermission")
        } else {
            println("ChainPermission successfully")
            super.handle(email, password)
        }
    }

    private fun isAdmin(email: String, password: String): Boolean {
        return true
    }
}