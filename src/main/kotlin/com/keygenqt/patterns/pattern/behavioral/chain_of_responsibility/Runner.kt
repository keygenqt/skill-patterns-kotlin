package com.keygenqt.patterns.pattern.behavioral.chain_of_responsibility

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {

        println("\n-------------- Chain1")

        ChainValidate().apply {
            this.setNext(ChainLogin())
                .setNext(ChainPermission())
        }.handle("test@gmail.com", "1234")

        println("\n-------------- Chain2")

        ChainValidate().apply {
            this.setNext(ChainLogin())
                .setNext(ChainPermission())
        }.handle("test@yandex.ru", "1234")
    }
}