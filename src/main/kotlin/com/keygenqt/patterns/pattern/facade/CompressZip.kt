package com.keygenqt.patterns.pattern.facade

class CompressZip(private val file: CompressFile) {
    fun compress() {
        println("Compress zip: ${file.path}")
    }
}