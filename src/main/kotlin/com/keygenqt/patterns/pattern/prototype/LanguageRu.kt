package com.keygenqt.patterns.pattern.prototype

import com.google.gson.JsonObject

class LanguageRu(
    name: String,
    country: String,
    private val genders: List<String>
) : Language(name, country) {

    constructor(languageRu: LanguageRu) : this(languageRu.name, languageRu.country, languageRu.genders.toList())

    override fun clone(): Language {
        return LanguageRu(this)
    }

    override fun toString(): String = JsonObject().apply {
        addProperty("name", name)
        addProperty("country", country)
        addProperty("genders", genders.toString().replace("""[\[\]]+""".toRegex(), ""))
    }.toString()
}