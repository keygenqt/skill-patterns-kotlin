package com.keygenqt.patterns.pattern.behavioral.command

abstract class Query(service: QueryService) {

    // base command
    abstract fun execute(): Boolean

    // common fun
    open fun name(): String {
        return this.javaClass.simpleName.replace("Query", "")
    }
}