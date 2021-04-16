package com.keygenqt.patterns.pattern.abstract_factory.interfaces


interface WidgetsFactory {
    fun createButton(): Button
    fun createInput(): Input
    fun createSelect(): Select
}