package com.keygenqt.patterns.pattern.behavioral.command

class QueryRequest1(private val service: QueryService) : Query(service) {
    override fun execute(): Boolean {
        println("execute ${service.getServiceRequest1()}")
        return true
    }
}