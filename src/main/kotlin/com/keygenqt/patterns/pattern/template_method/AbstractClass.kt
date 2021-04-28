package com.keygenqt.patterns.pattern.template_method

abstract class AbstractClass {
    open fun templateMethod() {
        step1()
        step2()
        step3()
        step4()
    }

    protected abstract fun step1()
    protected abstract fun step2()
    protected abstract fun step3()
    protected abstract fun step4()
}