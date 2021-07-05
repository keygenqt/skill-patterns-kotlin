package com.keygenqt.patterns.pattern.behavioral.visitor

interface Visitor {
    fun visitDot(d: Dot)
    fun visitRing(d: Ring)
}