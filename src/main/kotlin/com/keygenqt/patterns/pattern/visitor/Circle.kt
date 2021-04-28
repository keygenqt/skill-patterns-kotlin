package com.keygenqt.patterns.pattern.visitor

interface Circle {
    fun move(x: Int, y: Int)
    fun accept(v: Visitor)
}