package com.keygenqt.patterns.pattern.proxy

class Query : IQuery {
    override fun getListVideoNames(): List<String> {
        Thread.sleep(2000L) // delay response
        return listOf("video1", "video2", "video3")
    }
}