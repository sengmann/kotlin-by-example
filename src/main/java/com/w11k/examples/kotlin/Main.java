package com.w11k.examples.kotlin;

import com.w11k.examples.kotlin.calc.operators.Constant;
import com.w11k.examples.kotlin.calc.operators.Negate;
import com.w11k.examples.kotlin.calc.operators.Plus;
import com.w11k.examples.kotlin.calc.types.Expression;

import static com.w11k.examples.kotlin.calc.CalculatorExtensionsKt.toConstant;

public class Main {
    public static void main(String[] args) {
        Constant c = new Constant(1.0);
        toConstant(2.0);
        Expression p = new Plus(c, c);
        System.out.println("Constant c = " + c);
        System.out.println("plus " + p + " evals to " + p.eval());
        System.out.println("negate p " + new Negate(p) + " evals to " + new Negate(p).eval());
    }
}