package com.keygenqt.patterns.pattern.decorator

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        // default class
        Sender().send("default send - mail")

        // decoration classes
        SenderHTML(Sender()).send("send - HTML")
        SenderJSON(Sender()).send("send - JSON")

        // decoration without data
        SenderSuccess(Sender()).success()
    }
}