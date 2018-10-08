package com.w11k.examples.kotlin.calc.operators;

import com.w11k.examples.kotlin.calc.types.Expression;

public class Plus extends BinaryOperator {
    public Plus(Expression left, Expression right) {
        super(left, right, "+");
    }

    @Override
    public double eval() {
        return this.leftOperant.eval() + this.rightOperant.eval();
    }

    @Override
    public String toString() {
        return String.format("%s + %s", leftOperant, rightOperant);
    }
}
