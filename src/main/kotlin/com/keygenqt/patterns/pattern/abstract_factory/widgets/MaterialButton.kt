package com.keygenqt.patterns.pattern.abstract_factory.widgets

import com.keygenqt.patterns.pattern.abstract_factory.interfaces.Button

class MaterialButton: Button {
    override fun name(): String {
        return "MaterialButton"
    }
}