package com.keygenqt.patterns.pattern.adapter

class DataMemberToViewAdapter(private val model: DataMember) : DataView {
    override fun getName(): String {
        return model.name
    }
}