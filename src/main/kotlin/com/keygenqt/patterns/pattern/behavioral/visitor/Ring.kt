package com.keygenqt.patterns.pattern.behavioral.visitor

class Ring : Circle {
    override fun move(x: Int, y: Int) {
        println("Move to $x:$y")
    }

    override fun accept(v: Visitor) {
        v.visitRing(this)
    }
}