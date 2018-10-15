package com.w11k.examples.kotlin.calc.types;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class VariableAssigment {
    private final HashMap<String, Integer> assignments = new HashMap<>();

    public void assign(String variableName, int value) {
        this.assignments.put(variableName, value);
    }

    public int getAssignedValue(String variableName) {
        if (this.assignments.containsKey(variableName)) {
            return assignments.get(variableName);
        } else {
            throw new NoSuchElementException("No variable with name " + variableName + " was assigned");
        }
    }
}
