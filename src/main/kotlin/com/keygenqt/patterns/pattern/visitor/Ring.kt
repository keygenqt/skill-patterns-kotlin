package com.keygenqt.patterns.pattern.visitor

class Ring : Circle {
    override fun move(x: Int, y: Int) {
        println("Move to $x:$y")
    }

    override fun accept(v: Visitor) {
        v.visitRing(this)
    }
}