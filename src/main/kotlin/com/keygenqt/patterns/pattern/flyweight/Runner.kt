package com.keygenqt.patterns.pattern.flyweight

import com.keygenqt.patterns.pattern.flyweight.WorkerType.Companion.ROLE_DEV
import com.keygenqt.patterns.pattern.flyweight.WorkerType.Companion.ROLE_PM
import com.keygenqt.patterns.pattern.flyweight.WorkerType.Companion.UNIVERSITY_AECOM
import com.keygenqt.patterns.pattern.flyweight.WorkerType.Companion.UNIVERSITY_AFA
import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        val company = Company().apply {
            addWorker("Vitaliy", ROLE_PM, UNIVERSITY_AECOM)
            addWorker("Max", ROLE_PM, UNIVERSITY_AFA)
            addWorker("Emma", ROLE_DEV, UNIVERSITY_AFA)
            addWorker("Sophia", ROLE_PM, UNIVERSITY_AECOM)
        }

        company.printSalary()
    }
}