package com.keygenqt.patterns.pattern.structural.adapter

import com.keygenqt.patterns.utils.IRunner

class Runner : IRunner {
    override fun run() {
        val print = Print()
        val guest = DataGuest()
        val member = DataMember()

        // show class with interface DataView
        print.show(guest)

        // print.show(member) - Not working, member does not have interface DataView
        // use adapter
        val adapter = DataMemberToViewAdapter(member)

        // show class member
        print.show(adapter)
    }
}