package com.keygenqt.patterns.pattern.creational.abstract_factory.widgets

import com.keygenqt.patterns.pattern.creational.abstract_factory.interfaces.Button

class BootstrapButton : Button {
    override fun name(): String {
        return "BootstrapButton"
    }
}