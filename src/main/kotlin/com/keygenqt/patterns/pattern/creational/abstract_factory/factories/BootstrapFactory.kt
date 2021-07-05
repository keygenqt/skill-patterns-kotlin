package com.keygenqt.patterns.pattern.creational.abstract_factory.factories

import com.keygenqt.patterns.pattern.creational.abstract_factory.interfaces.Button
import com.keygenqt.patterns.pattern.creational.abstract_factory.interfaces.Input
import com.keygenqt.patterns.pattern.creational.abstract_factory.interfaces.Select
import com.keygenqt.patterns.pattern.creational.abstract_factory.interfaces.WidgetsFactory
import com.keygenqt.patterns.pattern.creational.abstract_factory.widgets.BootstrapButton
import com.keygenqt.patterns.pattern.creational.abstract_factory.widgets.BootstrapInput
import com.keygenqt.patterns.pattern.creational.abstract_factory.widgets.BootstrapSelect

class BootstrapFactory : WidgetsFactory {
    override fun createButton(): Button {
        return BootstrapButton()
    }

    override fun createInput(): Input {
        return BootstrapInput()
    }

    override fun createSelect(): Select {
        return BootstrapSelect()
    }
}