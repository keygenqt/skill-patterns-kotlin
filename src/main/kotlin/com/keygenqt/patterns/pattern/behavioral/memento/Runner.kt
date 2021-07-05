package com.keygenqt.patterns.pattern.behavioral.memento

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        val history = mutableListOf<Snapshot>()

        // create query
        val query = Query("https://url/to/1")
        // add history
        history.add(query.createSnapshot())
        // exec
        query.execute()

        // update query
        query.setConf("https://url/to/2")
        // add history
        history.add(query.createSnapshot())
        // exec
        query.execute()

        // update query
        query.setConf("https://url/to/3")
        // add history
        history.add(query.createSnapshot())
        // exec
        query.execute()

        // restore first state
        println("\nRestore first state:")
        history.firstOrNull()?.let {
            it.restore()
            query.execute()
        }
    }
}