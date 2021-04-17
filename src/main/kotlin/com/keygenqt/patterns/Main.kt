package com.keygenqt.patterns

import com.keygenqt.patterns.utils.*
import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import java.util.concurrent.Callable
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
        Runner.getRunner(pattern)?.run()
        return 0
    }
}

fun main(args: Array<String>): Unit = exitProcess(CommandLine(Arg()).execute(*args))