package com.keygenqt.patterns.pattern.memento

class Snapshot(private val query: Query, private val url: String) {

    private val time: Long = System.currentTimeMillis()

    fun restore() {
        query.url = url
    }
}