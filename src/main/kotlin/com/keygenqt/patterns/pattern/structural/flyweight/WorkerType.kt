package com.keygenqt.patterns.pattern.structural.flyweight

class WorkerType(
    val role: String,
    val university: String
) {
    companion object {
        // roles
        const val ROLE_PM = "pm"
        const val ROLE_DEV = "dev"

        // universities
        const val UNIVERSITY_AECOM = "AECOM"
        const val UNIVERSITY_AFA = "AFA"
    }
}