package com.keygenqt.patterns.pattern.prototype

abstract class Language(
    val name: String,
    val country: String
) {
    constructor(language: Language) : this(language.name, language.country)

    abstract fun clone(): Language
}