package com.keygenqt.patterns.pattern.behavioral.command

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {

    private val history = QueryHistory()
    private val service = QueryService()

    override fun run() {

        val action1 = {
            executeCommand(QueryRequest1(service))
        }
        val action2 = {
            executeCommand(QueryRequest2(service))
        }
        val action3 = {
            executeCommand(QueryRequest3(service))
        }

        println("\n------------- Execute\n")

        action1.invoke()
        action1.invoke()
        action1.invoke()
        action2.invoke()
        action3.invoke()
        action1.invoke()

        println("\n------------ History\n")

        history.showStack()
    }

    private fun executeCommand(query: Query) {
        if (query.execute()) {
            history.push(query)
        }
    }
}