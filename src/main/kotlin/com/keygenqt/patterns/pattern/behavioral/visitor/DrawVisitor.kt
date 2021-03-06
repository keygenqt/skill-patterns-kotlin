package com.keygenqt.patterns.pattern.behavioral.visitor

class DrawVisitor : Visitor {
    override fun visitDot(d: Dot) {
        println("Draw Dot")
    }

    override fun visitRing(d: Ring) {
        println("Draw Ring")
    }
}