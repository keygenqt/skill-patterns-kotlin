package com.keygenqt.patterns.pattern.command

class QueryRequest1(service: QueryService) : Query(service) {
    override fun execute(): Boolean {
        println("execute QueryRequest1")
        return true
    }
}