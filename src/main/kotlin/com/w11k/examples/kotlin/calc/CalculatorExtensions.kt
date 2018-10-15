package com.w11k.examples.kotlin.calc

import com.w11k.examples.kotlin.calc.operators.Constant
import com.w11k.examples.kotlin.calc.operators.Plus
import com.w11k.examples.kotlin.calc.types.Expression

fun Int.toConstant() = Constant(this)

operator fun Expression.plus(exp: Expression): Plus = Plus(this, exp)