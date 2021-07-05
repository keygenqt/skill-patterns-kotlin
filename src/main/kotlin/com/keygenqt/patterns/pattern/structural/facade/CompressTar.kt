package com.keygenqt.patterns.pattern.structural.facade

class CompressTar(private val file: CompressFile) {
    fun compress() {
        println("Compress tar: ${file.path}")
    }
}