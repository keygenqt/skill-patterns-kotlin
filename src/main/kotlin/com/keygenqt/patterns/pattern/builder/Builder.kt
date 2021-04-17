package com.keygenqt.patterns.pattern.builder

interface Builder {
    fun setName(value: String)
    fun setOs(value: DeviceOS)
    fun setCpu(value: DeviceCPU)
    fun setType(value: DeviceType)
}