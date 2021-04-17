package com.keygenqt.patterns.pattern.bridge

class BrowserChrome(private var isOpen: Boolean = false) : Browser {
    // browser name
    override fun getName(): String {
        return "Chrome"
    }

    // status for toggle open/close
    override fun isOpen(): Boolean {
        return isOpen
    }

    override fun open() {
        isOpen = true
    }

    override fun close() {
        isOpen = false
    }
}