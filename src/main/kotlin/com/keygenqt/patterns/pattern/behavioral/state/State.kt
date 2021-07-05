package com.keygenqt.patterns.pattern.behavioral.state

abstract class State(private val tv: TV) {
    abstract fun clickPlay()
    abstract fun clickStop()
    abstract fun clickLock()
}