package com.keygenqt.patterns.pattern.visitor

class DrawVisitor2 {
    // common interface
    // not have interface - always has Any
    fun visitCircle(c: Circle) {
        when (c) {
            is Dot -> visitDot(c)
            is Ring -> visitRing(c)
        }
    }

    // encapsulation...
    private fun visitDot(d: Dot) {
        println("Draw Dot")
    }

    // encapsulation...
    private fun visitRing(d: Ring) {
        println("Draw Ring")
    }
}