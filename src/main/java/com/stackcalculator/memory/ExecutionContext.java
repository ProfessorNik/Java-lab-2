package com.stackcalculator.memory;

import com.stackcalculator.exceptions.memory.UseConstantException;
import com.stackcalculator.memory.stackunits.StackUnit;

public interface ExecutionContext {
    StackUnit getNumberOnName(String name) throws UseConstantException;
    public void addNewConstant(String name, double value) throws UseConstantException;
}
