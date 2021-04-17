package com.keygenqt.patterns.pattern.builder

class DeviceDirector {
    companion object {
        fun <T : Builder> createAppleNoteBook(builder: T): T {
            builder.apply {
                setCpu(DeviceCPU.M1)
                setOs(DeviceOS.MACOS)
                setType(DeviceType.NOTEBOOK)
            }
            return builder
        }

        fun <T : Builder> createHuaweiPhone(builder: T): T {
            builder.apply {
                setCpu(DeviceCPU.KIRIN)
                setOs(DeviceOS.ANDROID)
                setType(DeviceType.PHONE)
            }
            return builder
        }
    }
}