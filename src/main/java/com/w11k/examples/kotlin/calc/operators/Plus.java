package com.w11k.examples.kotlin.calc.operators;

import com.w11k.examples.kotlin.calc.types.Expression;
import org.jetbrains.annotations.NotNull;

public class Plus implements BinaryOperator {

    static String symbol = "+";

    final Expression leftOperant;
    final Expression rightOperant;

    public Plus(Expression leftOperant, Expression rightOperant) {
        this.leftOperant = leftOperant;
        this.rightOperant = rightOperant;
    }

    @NotNull
    @Override
    public String getSymbol() {
        return Plus.symbol;
    }

    @NotNull
    @Override
    public Expression getLeftOperand() {
        return this.leftOperant;
    }

    @NotNull
    @Override
    public Expression getRightOperand() {
        return this.rightOperant;
    }

    @Override
    public int eval() {
        return this.getLeftOperand().eval() + this.getRightOperand().eval();
    }

    @Override
    public String toString() {
        return String.format("%s + %s", leftOperant, rightOperant);
    }
}
