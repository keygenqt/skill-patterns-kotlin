package com.keygenqt.patterns.pattern.builder

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {

    override fun run() {
        // build phone
        val phone = DeviceBuilder().apply {
            setName("Mate 30 Pro 5G")
            setOs(DeviceOS.ANDROID)
            setCpu(DeviceCPU.KIRIN)
            setType(DeviceType.PHONE)
        }.getResult()

        println(phone.toString())
        println("-----------------")

        // build pc
        val pc = DeviceBuilder().apply {
            setName("MacBook Air M1")
            setOs(DeviceOS.MACOS)
            setCpu(DeviceCPU.M1)
            setType(DeviceType.NOTEBOOK)
        }.getResult()

        println(pc.toString())
        println("-----------------")

        // build phone
        val phoneDirector = DeviceDirector.createHuaweiPhone(DeviceBuilder()).apply {
            setName("Mate 30 Pro 5G")
        }.getResult()


        println(phoneDirector.toString())
        println("-----------------")

        // build pc
        val pcDirector = DeviceDirector.createAppleNoteBook(DeviceBuilder()).apply {
            setName("MacBook Air M1")
        }.getResult()

        println(pcDirector.toString())
    }
}