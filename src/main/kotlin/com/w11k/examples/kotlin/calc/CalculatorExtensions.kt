package com.w11k.examples.kotlin.calc

import com.w11k.examples.kotlin.calc.operators.Constant
import com.w11k.examples.kotlin.calc.operators.Negate
import com.w11k.examples.kotlin.calc.types.Expression

fun Double.toConstant() = Constant(this)

fun Expression.negate() = Negate(this)