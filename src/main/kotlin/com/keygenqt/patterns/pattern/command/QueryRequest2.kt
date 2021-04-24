package com.keygenqt.patterns.pattern.command

class QueryRequest2(private val service: QueryService): Query(service) {
    override fun execute(): Boolean {
        println("execute ${service.getServiceRequest2()}")
        return true
    }
}