package com.keygenqt.patterns.pattern.bridge

interface Browser {
    fun getName(): String
    fun isOpen(): Boolean
    fun open()
    fun close()
}