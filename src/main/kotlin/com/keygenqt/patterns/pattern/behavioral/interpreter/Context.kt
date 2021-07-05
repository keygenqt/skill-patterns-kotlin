package com.keygenqt.patterns.pattern.behavioral.interpreter

class Context {
    fun evaluate(value: String): Expression? {
        // find last expression
        val regex = { v: String ->
            v.replaceFirst("""^(\-?\d+)(\-|\+)(\d+)(.+)?""".toRegex(), "$1~$2~$3~$4").split("~").toMutableList()
        }

        // save
        var result = mutableListOf<String>()

        while (result.size != 1) {

            // pares by regex
            result = regex(if (result.isEmpty()) value else result[3])

            // return if last number
            if (result.size == 1) {
                return NumberExpression(result[0].toInt())
            }

            // get left/right number
            val left = NumberExpression(result[0].toInt())
            val right = NumberExpression(result[2].toInt())

            // get result expression
            result[3] = "${
                when (result[1]) {
                    "-" -> MinusExpression(left, right).interpret()
                    "+" -> PlusExpression(left, right).interpret()
                    else -> 0
                }
            }${result[3]}"
        }
        return null
    }
}