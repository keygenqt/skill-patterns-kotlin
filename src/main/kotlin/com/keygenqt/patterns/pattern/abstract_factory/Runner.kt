package com.keygenqt.patterns.pattern.abstract_factory

import com.keygenqt.patterns.pattern.abstract_factory.factories.BootstrapFactory
import com.keygenqt.patterns.pattern.abstract_factory.factories.MaterialFactory
import com.keygenqt.patterns.pattern.abstract_factory.interfaces.WidgetsFactory
import com.keygenqt.patterns.utils.IRunner
import kotlin.random.Random

class Runner : IRunner {
    override fun run() {
        // create random factory type
        val wf: WidgetsFactory = if (Random.nextBoolean()) BootstrapFactory() else MaterialFactory()

        // print name class
        println("Factory: ${wf.javaClass.simpleName}\n")

        // print names widgets
        println(wf.createButton().name())
        println(wf.createInput().name())
        println(wf.createSelect().name())
    }
}