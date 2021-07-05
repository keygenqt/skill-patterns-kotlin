package com.keygenqt.patterns.pattern.creational.abstract_factory.widgets

import com.keygenqt.patterns.pattern.creational.abstract_factory.interfaces.Select

class BootstrapSelect: Select {
    override fun name(): String {
        return "BootstrapSelect"
    }
}