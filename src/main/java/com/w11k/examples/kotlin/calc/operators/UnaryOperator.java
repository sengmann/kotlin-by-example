package com.w11k.examples.kotlin.calc.operators;

import com.w11k.examples.kotlin.calc.types.Expression;

public abstract class UnaryOperator implements Expression {
    protected final Expression operant;
    protected final String symbol;

    public UnaryOperator(Expression operant, String symbol) {
        this.operant = operant;
        this.symbol = symbol;
    }
}
