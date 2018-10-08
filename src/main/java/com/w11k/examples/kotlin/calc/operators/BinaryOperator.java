package com.w11k.examples.kotlin.calc.operators;

import com.w11k.examples.kotlin.calc.types.Expression;

public abstract class BinaryOperator implements Expression {

    protected final Expression leftOperant;
    protected final Expression rightOperant;
    protected final String symbol;

    public BinaryOperator(Expression leftOperant, Expression rightOperant, String symbol) {
        this.leftOperant = leftOperant;
        this.rightOperant = rightOperant;
        this.symbol = symbol;
    }
}
