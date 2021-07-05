package com.keygenqt.patterns.pattern.structural.proxy

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        val query = Query()
        val queryCache = QueryCache(query)

        // check
        (1..10).forEach { _ ->
            Thread.sleep(500L)
            println(queryCache.getListVideoNames().toString())
        }
    }
}