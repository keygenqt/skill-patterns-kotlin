package com.keygenqt.patterns.utils

interface IRunner {
    fun run()
}

class Runner {
    companion object {
        fun getRunner(pattern: String): IRunner? {
            return when (pattern) {
                PATTERN_ABSTRACT_FACTORY -> com.keygenqt.patterns.pattern.abstract_factory.Runner()
                PATTERN_ADAPTER -> com.keygenqt.patterns.pattern.adapter.Runner()
                PATTERN_BRIDGE -> com.keygenqt.patterns.pattern.bridge.Runner()
                PATTERN_BUILDER -> com.keygenqt.patterns.pattern.builder.Runner()
                PATTERN_CHAIN_OF_RESPONSIBILITY -> com.keygenqt.patterns.pattern.chain_of_responsibility.Runner()
                PATTERN_COMMAND -> com.keygenqt.patterns.pattern.command.Runner()
                PATTERN_COMPOSITE -> com.keygenqt.patterns.pattern.composite.Runner()
                PATTERN_DECORATOR -> com.keygenqt.patterns.pattern.decorator.Runner()
                PATTERN_FACADE -> com.keygenqt.patterns.pattern.facade.Runner()
                PATTERN_FACTORY_METHOD -> com.keygenqt.patterns.pattern.factory_method.Runner()
                PATTERN_FLYWEIGHT -> com.keygenqt.patterns.pattern.flyweight.Runner()
                PATTERN_INTERPRETER -> com.keygenqt.patterns.pattern.interpreter.Runner()
                PATTERN_ITERATOR -> com.keygenqt.patterns.pattern.iterator.Runner()
                PATTERN_MEDIATOR -> com.keygenqt.patterns.pattern.mediator.Runner()
                PATTERN_MEMENTO -> com.keygenqt.patterns.pattern.memento.Runner()
                PATTERN_OBSERVER -> com.keygenqt.patterns.pattern.observer.Runner()
                PATTERN_PROTOTYPE -> com.keygenqt.patterns.pattern.prototype.Runner()
                PATTERN_PROXY -> com.keygenqt.patterns.pattern.proxy.Runner()
                PATTERN_SINGLETON -> com.keygenqt.patterns.pattern.singleton.Runner()
                PATTERN_STATE -> com.keygenqt.patterns.pattern.state.Runner()
                PATTERN_STRATEGY -> com.keygenqt.patterns.pattern.strategy.Runner()
                PATTERN_TEMPLATE_METHOD -> com.keygenqt.patterns.pattern.template_method.Runner()
                PATTERN_VISITOR -> com.keygenqt.patterns.pattern.visitor.Runner()
                else -> null
            }
        }
    }
}