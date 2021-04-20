package com.keygenqt.patterns.pattern.command

class QueryRequest3(private val service: QueryService) : Query(service) {
    override fun execute(): Boolean {
        println("execute ${service.getServiceRequest1()}")
        return true
    }
}