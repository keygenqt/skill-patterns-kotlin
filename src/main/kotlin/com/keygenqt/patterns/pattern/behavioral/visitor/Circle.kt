package com.keygenqt.patterns.pattern.behavioral.visitor

interface Circle {
    fun move(x: Int, y: Int)
    fun accept(v: Visitor)
}