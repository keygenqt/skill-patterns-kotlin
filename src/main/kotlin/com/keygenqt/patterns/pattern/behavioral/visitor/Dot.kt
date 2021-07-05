package com.keygenqt.patterns.pattern.behavioral.visitor

class Dot : Circle {
    override fun move(x: Int, y: Int) {
        println("Move to $x:$y")
    }

    override fun accept(v: Visitor) {
        v.visitDot(this)
    }
}