package com.keygenqt.patterns.pattern.structural.bridge

interface Browser {
    fun getName(): String
    fun isOpen(): Boolean
    fun open()
    fun close()
}