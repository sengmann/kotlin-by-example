package com.w11k.examples.kotlin.calc.operators

import com.w11k.examples.kotlin.calc.types.Expression
import com.w11k.examples.kotlin.calc.types.VariableAssigment

interface UnaryOperator : Expression {
    val operand: Expression
    val symbol: String
}

interface BinaryOperator : Expression {
    val leftOperand: Expression
    val rightOperand: Expression
    val symbol: String
}

data class Variable(val name: String) : Expression {
    override fun eval(variableAssigment: VariableAssigment): Int = variableAssigment.getAssignedValue(this.name)
    override fun toString(): String = name
}

data class Minus(override val leftOperand: Expression, override val rightOperand: Expression) : BinaryOperator {
    override val symbol = "-"
    override fun eval(variableAssigment: VariableAssigment): Int =
        leftOperand.eval(variableAssigment) - rightOperand.eval(variableAssigment)
    override fun toString(): String = """($leftOperand - $rightOperand)"""
}

data class Multiplication(override val leftOperand: Expression, override val rightOperand: Expression) : BinaryOperator {

    override val symbol: String = "*"

    override fun eval(variableAssigment: VariableAssigment): Int {
        return this.leftOperand.eval(variableAssigment) * this.rightOperand.eval(variableAssigment);
    }

    override fun toString(): String = "($leftOperand * $rightOperand)"
}

data class Diversion(override val leftOperand: Expression, override val rightOperand: Expression) : BinaryOperator {
    override val symbol: String = "/"
    override fun eval(variableAssigment: VariableAssigment): Int =
        leftOperand.eval(variableAssigment) / rightOperand.eval(variableAssigment)
    override fun toString(): String = "($leftOperand / $rightOperand)"
}