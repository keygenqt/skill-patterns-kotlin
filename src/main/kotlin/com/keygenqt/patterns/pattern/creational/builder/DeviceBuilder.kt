package com.keygenqt.patterns.pattern.creational.builder

class DeviceBuilder : Builder {

    // class for build
    private val device: Device = Device()

    // get result
    fun getResult(): Device {
        return device
    }

    // builders methods
    override fun setName(value: String) {
        device.name = value
    }

    override fun setOs(value: DeviceOS) {
        device.os = value
    }

    override fun setCpu(value: DeviceCPU) {
        device.cpu = value
    }

    override fun setType(value: DeviceType) {
        device.type = value
    }
}