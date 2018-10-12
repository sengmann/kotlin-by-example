package com.w11k.examples.kotlin.calc

import com.w11k.examples.kotlin.calc.operators.Constant
import com.w11k.examples.kotlin.calc.operators.Negate
import com.w11k.examples.kotlin.calc.operators.Plus
import com.w11k.examples.kotlin.calc.types.Expression

fun Int.toConstant() = Constant(this)

fun Expression.negate() = Negate(this)

operator fun Expression.plus(exp: Expression): Plus = Plus(this, exp)