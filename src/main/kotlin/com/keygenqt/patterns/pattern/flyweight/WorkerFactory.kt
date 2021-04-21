package com.keygenqt.patterns.pattern.flyweight

class WorkerFactory {
    companion object {
        private val workerTypes: HashMap<String, WorkerType> = hashMapOf()

        fun getWorkerType(role: String, university: String): WorkerType {
            return "$role-$university".let { key ->
                workerTypes[key] ?: run {
                    workerTypes[key] = WorkerType(role, university)
                    workerTypes[key]!!
                }
            }
        }
    }
}