package com.keygenqt.patterns.pattern.structural.adapter

data class DataGuest(
    val id: String = "1",
    private val name: String = "guest"
) : DataView {
    override fun getName(): String {
        return name
    }
}