package com.w11k.examples.kotlin.calc.operators

import com.w11k.examples.kotlin.calc.types.Expression

class Variable(val name: String, var value: Double = Double.NaN): Expression {
    override fun eval(): Double = value
    override fun toString(): String = """$name: $value"""

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Variable

        if (name != other.name) return false
        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + value.hashCode()
        return result
    }
}

class Minus(left: Expression, right: Expression) : BinaryOperator(left, right, "-") {

    override fun eval(): Double = leftOperant.eval() - rightOperant.eval()

    override fun toString(): String = """$leftOperant - $rightOperant"""

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}

class Negate(operant: Expression): UnaryOperator(operant, "-") {
    override fun eval(): Double = this.operant.eval() * -1
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String = """-($operant)"""
}