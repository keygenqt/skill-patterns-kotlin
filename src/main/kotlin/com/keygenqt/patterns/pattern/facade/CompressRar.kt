package com.keygenqt.patterns.pattern.facade

class CompressRar(private val file: CompressFile) {
    fun compress() {
        println("Compress rar: ${file.path}")
    }
}