package com.keygenqt.patterns.pattern.command

class QueryRequest2(service: QueryService): Query(service) {
    override fun execute(): Boolean {
        println("execute QueryRequest2")
        return true
    }
}