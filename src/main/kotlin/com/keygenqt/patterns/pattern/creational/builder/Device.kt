package com.keygenqt.patterns.pattern.creational.builder

enum class DeviceCPU {
    INTEL, AMD, M1, KIRIN
}

enum class DeviceOS {
    ANDROID, IOS, WINDOWS, LINUX, MACOS
}

enum class DeviceType {
    PHONE, PC, NOTEBOOK
}

data class Device(
    var name: String? = null,
    var cpu: DeviceCPU? = null,
    var os: DeviceOS? = null,
    var type: DeviceType? = null
)