package com.keygenqt.patterns.pattern.facade

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        CompressFacade.compressFileMultipleFormats("my/path/to/file")
    }
}