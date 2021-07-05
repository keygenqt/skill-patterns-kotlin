package com.keygenqt.patterns.pattern.structural.bridge

abstract class ActionBrowserBase(private val browser: Browser) : ActionBrowser {

    // base method for show name
    override fun showName() {
        print("${this.javaClass.simpleName.replace("ActionBrowser", "")}: ${browser.getName()}. ")
    }

    // base toggle enable
    override fun toggleEnable() {
        when (browser.isOpen()) {
            true -> browser.close()
            false -> browser.open()
        }
    }
}