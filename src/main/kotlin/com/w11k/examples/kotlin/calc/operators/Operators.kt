package com.w11k.examples.kotlin.calc.operators

import com.w11k.examples.kotlin.calc.types.Expression

interface UnaryOperator : Expression {
    val operand: Expression
    val symbol: String
}

interface BinaryOperator : Expression {
    val leftOperand: Expression
    val rightOperand: Expression
    val symbol: String
}

data class Variable(val name: String, var value: Int = Int.MIN_VALUE) : Expression {
    override fun eval(): Int = value
    override fun toString(): String = """$name: $value"""
}

data class Minus(override val leftOperand: Expression, override val rightOperand: Expression) : BinaryOperator {
    override val symbol = "-"
    override fun eval(): Int = leftOperand.eval() - rightOperand.eval()
    override fun toString(): String = """$leftOperand - $rightOperand"""
}

data class Negate(override val operand: Expression) : UnaryOperator {
    override val symbol: String = "-"
    override fun eval(): Int = this.operand.eval() * -1
    override fun toString(): String = "-($operand)"
}

data class Multiplication(override val leftOperand: Expression, override val rightOperand: Expression) : BinaryOperator {

    override val symbol: String = "*"

    override fun eval(): Int {
        return this.leftOperand.eval() * this.rightOperand.eval();
    }

    override fun toString(): String = "$leftOperand * $rightOperand"
}

data class Diversion(override val leftOperand: Expression, override val rightOperand: Expression) : BinaryOperator {
    override val symbol: String = "/"
    override fun eval(): Int = leftOperand.eval() / rightOperand.eval()
    override fun toString(): String = "$leftOperand / $rightOperand"
}