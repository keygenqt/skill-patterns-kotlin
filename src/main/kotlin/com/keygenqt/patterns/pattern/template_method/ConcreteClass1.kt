package com.keygenqt.patterns.pattern.template_method

class ConcreteClass1 : AbstractClass() {

    override fun templateMethod() {
        super.templateMethod()
        step5Class1()
        step6Class1()
    }

    override fun step1() {
        println("step1")
    }

    override fun step2() {
        println("step2")
    }

    override fun step3() {
        println("step3")
    }

    override fun step4() {
        println("step4")
    }

    private fun step5Class1() {
        println("step4ConcreteClass1")
    }

    private fun step6Class1() {
        println("step4ConcreteClass1")
    }
}