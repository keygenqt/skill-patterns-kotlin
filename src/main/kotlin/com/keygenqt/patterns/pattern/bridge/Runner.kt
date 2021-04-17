package com.keygenqt.patterns.pattern.bridge

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        println()

        // create actions
        val windowsChrome = ActionBrowserWindows(BrowserChrome())
        val linuxChrome = ActionBrowserLinux(BrowserChrome())
        val macChrome = ActionBrowserMac(BrowserChrome())

        // actions
        windowsChrome.showName()
        windowsChrome.toggleEnable()

        linuxChrome.showName()
        linuxChrome.toggleEnable()

        macChrome.showName()
        macChrome.toggleEnable()

        println()

        // create actions
        val windowsEdge = ActionBrowserWindows(BrowserEdge())
        val linuxEdge = ActionBrowserLinux(BrowserEdge())
        val macEdge = ActionBrowserMac(BrowserEdge())

        // actions
        windowsEdge.showName()
        windowsEdge.toggleEnable()

        linuxEdge.showName()
        linuxEdge.toggleEnable()

        macEdge.showName()
        macEdge.toggleEnable()
    }
}