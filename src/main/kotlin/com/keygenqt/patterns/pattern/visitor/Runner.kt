package com.keygenqt.patterns.pattern.visitor

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        println("\nclassic version:")
        val draw = DrawVisitor()
        listOf(Dot(), Dot(), Ring()).forEach {
            it.accept(draw)
        }

        println("\neasy kotlin version:")
        val draw2 = DrawVisitor2()
        listOf(Dot(), Dot(), Ring()).forEach {
            draw2.visitCircle(it)
        }
    }
}