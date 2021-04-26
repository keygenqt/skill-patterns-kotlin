package com.keygenqt.patterns.pattern.proxy

class QueryCache(private val service: IQuery) : IQuery {

    private var list: List<String>? = null

    override fun getListVideoNames(): List<String> {
        if (list == null) {
            // change null to empty to switch as an active request
            list = emptyList()
            // new thread for no blocking
            Thread {
                list = service.getListVideoNames()
                println("-> Response successfully")
            }.start()
        }
        // return cache
        return list ?: emptyList()
    }
}