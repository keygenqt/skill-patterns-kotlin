package com.keygenqt.patterns.pattern.behavioral.state

class StateLocked(private val tv: TV) : State(tv) {
    override fun clickPlay() {
        activate()
    }

    override fun clickStop() {
        activate()
    }

    override fun clickLock() {
        // already lock
    }

    private fun activate() {
        // disable locked status
        tv.state = StateReady(tv)
    }
}