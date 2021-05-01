package com.keygenqt.patterns.pattern.state

class StateReady(private val tv: TV) : State(tv) {

    override fun clickPlay() {
        println("play")
    }

    override fun clickStop() {
        println("stop")
    }

    override fun clickLock() {
        // enable locked status
        tv.state = StateLocked(tv)
    }
}