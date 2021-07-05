package com.keygenqt.patterns.pattern.structural.flyweight

import com.keygenqt.patterns.pattern.structural.flyweight.WorkerType.Companion.ROLE_DEV
import com.keygenqt.patterns.pattern.structural.flyweight.WorkerType.Companion.ROLE_PM
import com.keygenqt.patterns.pattern.structural.flyweight.WorkerType.Companion.UNIVERSITY_AECOM
import com.keygenqt.patterns.pattern.structural.flyweight.WorkerType.Companion.UNIVERSITY_AFA
import java.text.DecimalFormat


class Company {
    companion object {
        const val SALARY_AECOM_PM = 200.10
        const val SALARY_AECOM_DEV = 300.60
        const val SALARY_AFA_PM = 100.30
        const val SALARY_AFA_DEV = 305.00
    }

    private val workers = mutableListOf<Worker>()

    fun addWorker(name: String, role: String, university: String) {
        val workerType = WorkerFactory.getWorkerType(role, university)
        val worker = Worker(name, workerType)
        workers.add(worker)
    }

    fun printSalary() {
        var sum = 0.0
        workers.forEach {
            it.workerType.let { type ->
                if (type.university == UNIVERSITY_AECOM && type.role == ROLE_PM) {
                    sum += SALARY_AECOM_PM
                } else if (type.university == UNIVERSITY_AECOM && type.role == ROLE_DEV) {
                    sum += SALARY_AECOM_DEV
                } else if (type.university == UNIVERSITY_AFA && type.role == ROLE_PM) {
                    sum += SALARY_AFA_PM
                } else if (type.university == UNIVERSITY_AFA && type.role == ROLE_DEV) {
                    sum += SALARY_AFA_DEV
                }
            }
        }
        println("Salary sum: ${DecimalFormat("0.00").format(sum)}")
    }
}