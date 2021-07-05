package com.keygenqt.patterns.pattern.structural.facade

class CompressFacade {
    companion object {
        fun compressFileMultipleFormats(path: String) {
            CompressFile(path).let {
                CompressRar(it).compress()
                CompressTar(it).compress()
                CompressZip(it).compress()
            }
        }
    }
}