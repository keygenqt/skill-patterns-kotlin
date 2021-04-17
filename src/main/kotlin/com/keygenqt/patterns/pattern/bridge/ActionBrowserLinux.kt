package com.keygenqt.patterns.pattern.bridge

class ActionBrowserLinux(private val browser: Browser) : ActionBrowserBase(browser) {

    // override for Linux
    override fun toggleEnable() {
        super.toggleEnable()
        if (browser.isOpen()) {
            println("Open for Linux")
        } else {
            println("Close for Linux")
        }
    }
}