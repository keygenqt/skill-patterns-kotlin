package com.keygenqt.patterns.pattern.creational.prototype

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        val languageEng = LanguageEng("English", "USA", 470)
        println(languageEng.clone().toString())

        val languageRu = LanguageRu("Russian", "Russia", listOf("male", "female", "medium"))
        println(languageRu.clone().toString())
    }
}