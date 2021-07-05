package com.keygenqt.patterns.pattern.structural.bridge

open class ActionBrowserWindows(private val browser: Browser) : ActionBrowserBase(browser) {

    // override for Windows
    override fun toggleEnable() {
        super.toggleEnable()
        if (browser.isOpen()) {
            println("Open for Windows")
        } else {
            println("Close for Windows")
        }
    }
}