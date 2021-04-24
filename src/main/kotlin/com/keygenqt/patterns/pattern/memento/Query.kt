package com.keygenqt.patterns.pattern.memento

class Query(var url: String) {

    fun setConf(url: String) {
        this.url = url
    }

    fun execute() {
        println("Execute: $url")
    }

    fun createSnapshot(): Snapshot {
        return Snapshot(this, url)
    }
}