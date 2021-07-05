package com.keygenqt.patterns.pattern.behavioral.command

class QueryRequest3(private val service: QueryService) : Query(service) {
    override fun execute(): Boolean {
        println("execute ${service.getServiceRequest3()}")
        return true
    }
}