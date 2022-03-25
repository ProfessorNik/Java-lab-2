package com.stackcalculator.memory;

import com.stackcalculator.exceptions.memory.UnableGettingUnitException;
import com.stackcalculator.memory.stackunits.StackUnit;

import java.util.Stack;

public class NumberUnitStack implements NumberStack {
    private final Stack<StackUnit> stack;

    public NumberUnitStack() {
        stack = new Stack<>();
    }

    @Override
    public StackUnit pop() throws UnableGettingUnitException {
        StackUnit unit = stack.pop();
        if(unit == null)
            throw UnableGettingUnitException.buildEmptyStack();
        return stack.pop();
    }

    @Override
    public void push(StackUnit unit) {
        stack.push(unit);
    }

    @Override
    public StackUnit peek() throws UnableGettingUnitException {
        StackUnit unit = stack.peek();
        if(unit == null)
            throw UnableGettingUnitException.buildEmptyStack();
        return stack.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
