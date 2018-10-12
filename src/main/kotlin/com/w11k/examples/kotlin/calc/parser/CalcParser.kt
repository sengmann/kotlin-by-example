package com.w11k.examples.kotlin.calc.parser

import com.w11k.examples.kotlin.calc.operators.Constant
import com.w11k.examples.kotlin.calc.types.Expression


class CalcParser {


    fun parse(expression: String): Expression {
        val exp: String = expression.toLowerCase().trim()
        return Constant(Int.MIN_VALUE)
    }
}

