package com.keygenqt.patterns.pattern.structural.facade

class CompressZip(private val file: CompressFile) {
    fun compress() {
        println("Compress zip: ${file.path}")
    }
}