package com.keygenqt.patterns.pattern.command

class QueryRequest3(service: QueryService): Query(service) {
    override fun execute(): Boolean {
        println("execute QueryRequest3")
        return true
    }
}