package com.w11k.examples.kotlin;

import com.w11k.examples.kotlin.calc.operators.Constant;
import com.w11k.examples.kotlin.calc.operators.Plus;
import com.w11k.examples.kotlin.calc.operators.Variable;
import com.w11k.examples.kotlin.calc.types.Expression;
import com.w11k.examples.kotlin.calc.types.VariableAssigment;

public class Main {
    public static void main(String[] args) {
        Constant c = new Constant(1);
        VariableAssigment va = new VariableAssigment();
        va.assign("a", 2);
        Variable a = new Variable("a");
        Expression p = new Plus(c, c);
        System.out.println("Constant c = " + c);
        System.out.println("plus " + p + " evals to " + p.eval(va));
        System.out.println(String.format("Variable %s=%d", a, a.eval(va)));
    }
}
