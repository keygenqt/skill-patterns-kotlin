package com.keygenqt.patterns.pattern.structural.bridge

open class ActionBrowserMac(private val browser: Browser) : ActionBrowserBase(browser) {

    // override for Mac
    override fun toggleEnable() {
        super.toggleEnable()
        if (browser.isOpen()) {
            println("Open for Mac")
        } else {
            println("Close for Mac")
        }
    }
}