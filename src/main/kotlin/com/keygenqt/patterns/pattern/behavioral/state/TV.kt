package com.keygenqt.patterns.pattern.behavioral.state

class TV {
    var state: State = StateLocked(this)

    fun getStatusName(): String {
        return "State: ${(state.javaClass.simpleName).replace("State", "").toLowerCase()}"
    }

    fun clickPlay() {
        state.clickPlay()
    }

    fun clickStop() {
        state.clickStop()
    }

    fun clickLock() {
        state.clickLock()
    }
}