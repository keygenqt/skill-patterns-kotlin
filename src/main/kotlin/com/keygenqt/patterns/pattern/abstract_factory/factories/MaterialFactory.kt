package com.keygenqt.patterns.pattern.abstract_factory.factories

import com.keygenqt.patterns.pattern.abstract_factory.interfaces.Button
import com.keygenqt.patterns.pattern.abstract_factory.interfaces.Input
import com.keygenqt.patterns.pattern.abstract_factory.interfaces.Select
import com.keygenqt.patterns.pattern.abstract_factory.interfaces.WidgetsFactory
import com.keygenqt.patterns.pattern.abstract_factory.widgets.MaterialButton
import com.keygenqt.patterns.pattern.abstract_factory.widgets.MaterialInput
import com.keygenqt.patterns.pattern.abstract_factory.widgets.MaterialSelect

class MaterialFactory : WidgetsFactory {
    override fun createButton(): Button {
        return MaterialButton()
    }

    override fun createInput(): Input {
        return MaterialInput()
    }

    override fun createSelect(): Select {
        return MaterialSelect()
    }
}