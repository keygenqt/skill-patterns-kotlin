package com.keygenqt.patterns.utils

interface IRunner {
    fun run()
}

class Runner {
    companion object {
        fun getRunner(pattern: String): IRunner? {
            return when (pattern) {
                PATTERN_ABSTRACT_FACTORY -> com.keygenqt.patterns.pattern.creational.abstract_factory.Runner()
                PATTERN_ADAPTER -> com.keygenqt.patterns.pattern.structural.adapter.Runner()
                PATTERN_BRIDGE -> com.keygenqt.patterns.pattern.structural.bridge.Runner()
                PATTERN_BUILDER -> com.keygenqt.patterns.pattern.creational.builder.Runner()
                PATTERN_CHAIN_OF_RESPONSIBILITY -> com.keygenqt.patterns.pattern.behavioral.chain_of_responsibility.Runner()
                PATTERN_COMMAND -> com.keygenqt.patterns.pattern.behavioral.command.Runner()
                PATTERN_COMPOSITE -> com.keygenqt.patterns.pattern.structural.composite.Runner()
                PATTERN_DECORATOR -> com.keygenqt.patterns.pattern.structural.decorator.Runner()
                PATTERN_FACADE -> com.keygenqt.patterns.pattern.structural.facade.Runner()
                PATTERN_FACTORY_METHOD -> com.keygenqt.patterns.pattern.creational.factory_method.Runner()
                PATTERN_FLYWEIGHT -> com.keygenqt.patterns.pattern.structural.flyweight.Runner()
                PATTERN_INTERPRETER -> com.keygenqt.patterns.pattern.behavioral.interpreter.Runner()
                PATTERN_ITERATOR -> com.keygenqt.patterns.pattern.behavioral.iterator.Runner()
                PATTERN_MEDIATOR -> com.keygenqt.patterns.pattern.behavioral.mediator.Runner()
                PATTERN_MEMENTO -> com.keygenqt.patterns.pattern.behavioral.memento.Runner()
                PATTERN_OBSERVER -> com.keygenqt.patterns.pattern.behavioral.observer.Runner()
                PATTERN_PROTOTYPE -> com.keygenqt.patterns.pattern.creational.prototype.Runner()
                PATTERN_PROXY -> com.keygenqt.patterns.pattern.structural.proxy.Runner()
                PATTERN_SINGLETON -> com.keygenqt.patterns.pattern.creational.singleton.Runner()
                PATTERN_STATE -> com.keygenqt.patterns.pattern.behavioral.state.Runner()
                PATTERN_STRATEGY -> com.keygenqt.patterns.pattern.behavioral.strategy.Runner()
                PATTERN_TEMPLATE_METHOD -> com.keygenqt.patterns.pattern.behavioral.template_method.Runner()
                PATTERN_VISITOR -> com.keygenqt.patterns.pattern.behavioral.visitor.Runner()
                else -> null
            }
        }
    }
}