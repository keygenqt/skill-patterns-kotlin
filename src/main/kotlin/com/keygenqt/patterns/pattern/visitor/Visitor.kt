package com.keygenqt.patterns.pattern.visitor

interface Visitor {
    fun visitDot(d: Dot)
    fun visitRing(d: Ring)
}