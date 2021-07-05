package com.keygenqt.patterns.pattern.behavioral.template_method

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        val concreteClass1 = ConcreteClass1()
        val concreteClass2 = ConcreteClass2()
        val concreteClass3 = ConcreteClass3()

        concreteClass1.templateMethod()
        println("--------------------")
        concreteClass2.templateMethod()
        println("--------------------")
        concreteClass3.templateMethod()
    }
}