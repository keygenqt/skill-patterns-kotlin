package com.keygenqt.patterns

import com.keygenqt.patterns.pattern.abstract_factory.factories.BootstrapFactory
import com.keygenqt.patterns.pattern.abstract_factory.factories.MaterialFactory
import com.keygenqt.patterns.pattern.abstract_factory.interfaces.WidgetsFactory
import com.keygenqt.patterns.pattern.adapter.DataGuest
import com.keygenqt.patterns.pattern.adapter.DataMember
import com.keygenqt.patterns.pattern.adapter.DataMemberToViewAdapter
import com.keygenqt.patterns.pattern.adapter.Print
import com.keygenqt.patterns.pattern.bridge.*
import com.keygenqt.patterns.pattern.builder.*
import com.keygenqt.patterns.pattern.singleton.Singleton
import com.keygenqt.patterns.utils.*
import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import java.util.concurrent.Callable
import kotlin.random.Random
import kotlin.system.exitProcess

@Command(
    name = "patterns", mixinStandardHelpOptions = true, version = ["patterns 1.0"], description = ["""
Examples of Reusable Design Patterns:
* "$PATTERN_ABSTRACT_FACTORY"
* "$PATTERN_ADAPTER"
* "$PATTERN_BRIDGE"
* "$PATTERN_BUILDER"
* "$PATTERN_CHAIN_OF_RESPONSIBILITY"
* "$PATTERN_COMMAND"
* "$PATTERN_COMPOSITE"
* "$PATTERN_DECORATOR"
* "$PATTERN_FACADE"
* "$PATTERN_FACTORY_METHOD"
* "$PATTERN_FLYWEIGHT"
* "$PATTERN_INTERPRETER"
* "$PATTERN_ITERATOR"
* "$PATTERN_MEDIATOR"
* "$PATTERN_MEMENTO"
* "$PATTERN_OBSERVER"
* "$PATTERN_PROTOTYPE"
* "$PATTERN_PROXY"
* "$PATTERN_SINGLETON"
* "$PATTERN_STATE"
* "$PATTERN_STRATEGY"
* "$PATTERN_TEMPLATE_METHOD"
* "$PATTERN_VISITOR"
"""]
)
class Arg : Callable<Int> {

    @Option(names = ["-p", "--pattern"], description = ["$PATTERN_ABSTRACT_FACTORY, $PATTERN_ADAPTER, ..."])
    var pattern = PATTERN_ABSTRACT_FACTORY

    override fun call(): Int {

        println("Pattern: $pattern")

        when (pattern) {
            PATTERN_ABSTRACT_FACTORY -> {
                // create random factory type
                val wf: WidgetsFactory = if (Random.nextBoolean()) BootstrapFactory() else MaterialFactory()

                // print name class
                println("Factory: ${wf.javaClass.simpleName}\n")

                // print names widgets
                println(wf.createButton().name())
                println(wf.createInput().name())
                println(wf.createSelect().name())
            }
            PATTERN_ADAPTER -> {

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
            PATTERN_BRIDGE -> {
                println()

                // create actions
                val windowsChrome = ActionBrowserWindows(BrowserChrome())
                val linuxChrome = ActionBrowserLinux(BrowserChrome())
                val macChrome = ActionBrowserMac(BrowserChrome())

                // actions
                windowsChrome.showName()
                windowsChrome.toggleEnable()

                linuxChrome.showName()
                linuxChrome.toggleEnable()

                macChrome.showName()
                macChrome.toggleEnable()

                println()

                // create actions
                val windowsEdge = ActionBrowserWindows(BrowserEdge())
                val linuxEdge = ActionBrowserLinux(BrowserEdge())
                val macEdge = ActionBrowserMac(BrowserEdge())

                // actions
                windowsEdge.showName()
                windowsEdge.toggleEnable()

                linuxEdge.showName()
                linuxEdge.toggleEnable()

                macEdge.showName()
                macEdge.toggleEnable()
            }
            PATTERN_BUILDER -> {

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
            PATTERN_CHAIN_OF_RESPONSIBILITY -> {
                println(PATTERN_CHAIN_OF_RESPONSIBILITY)
            }
            PATTERN_COMMAND -> {
                println(PATTERN_COMMAND)
            }
            PATTERN_COMPOSITE -> {
                println(PATTERN_COMPOSITE)
            }
            PATTERN_DECORATOR -> {
                println(PATTERN_DECORATOR)
            }
            PATTERN_FACADE -> {
                println(PATTERN_FACADE)
            }
            PATTERN_FACTORY_METHOD -> {
                println(PATTERN_FACTORY_METHOD)
            }
            PATTERN_FLYWEIGHT -> {
                println(PATTERN_FLYWEIGHT)
            }
            PATTERN_INTERPRETER -> {
                println(PATTERN_INTERPRETER)
            }
            PATTERN_ITERATOR -> {
                println(PATTERN_ITERATOR)
            }
            PATTERN_MEDIATOR -> {
                println(PATTERN_MEDIATOR)
            }
            PATTERN_MEMENTO -> {
                println(PATTERN_MEMENTO)
            }
            PATTERN_OBSERVER -> {
                println(PATTERN_OBSERVER)
            }
            PATTERN_PROTOTYPE -> {
                println(PATTERN_PROTOTYPE)
            }
            PATTERN_PROXY -> {
                println(PATTERN_PROXY)
            }
            PATTERN_SINGLETON -> {
                val singleton1 = Singleton.getInstance()
                println("getInstance() 1")
                val singleton2 = Singleton.getInstance()
                println("getInstance() 2")
                val singleton3 = Singleton.getInstance()
                println("getInstance() 3")
                val singleton4 = Singleton.getInstance()
                println("getInstance() 4")
            }
            PATTERN_STATE -> {
                println(PATTERN_STATE)
            }
            PATTERN_STRATEGY -> {
                println(PATTERN_STRATEGY)
            }
            PATTERN_TEMPLATE_METHOD -> {
                println(PATTERN_TEMPLATE_METHOD)
            }
            PATTERN_VISITOR -> {
                println(PATTERN_VISITOR)
            }
        }
        return 0
    }
}

fun main(args: Array<String>): Unit = exitProcess(CommandLine(Arg()).execute(*args))