package com.keygenqt.patterns.pattern.creational.prototype

import com.google.gson.JsonObject

class LanguageEng(
    name: String,
    country: String,
    private val countIrregularVerb: Int
) : Language(name, country) {

    constructor(languageEng: LanguageEng) : this(languageEng.name, languageEng.country, languageEng.countIrregularVerb)

    override fun clone(): Language {
        return LanguageEng(this)
    }

    override fun toString(): String = JsonObject().apply {
        addProperty("name", name)
        addProperty("country", country)
        addProperty("countIrregularVerb", countIrregularVerb)
    }.toString()
}