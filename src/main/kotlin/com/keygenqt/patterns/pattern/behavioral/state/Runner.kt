package com.keygenqt.patterns.pattern.behavioral.state

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        val tv = TV()

        println(tv.getStatusName())
        tv.clickPlay()
        println(tv.getStatusName())
        tv.clickPlay()
        tv.clickLock()
        println(tv.getStatusName())
    }
}