package com.w11k.examples.kotlin.calc.operators;

import com.w11k.examples.kotlin.calc.types.Expression;

import java.util.Objects;

public class Constant implements Expression {

    private final int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override
    public int eval() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%d", this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Constant constant = (Constant) o;
        return Double.compare(constant.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
