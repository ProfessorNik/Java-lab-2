package com.stackcalculator.memory;

import com.stackcalculator.exceptions.memory.UseConstantException;
import com.stackcalculator.memory.stackunits.Constant;
import com.stackcalculator.memory.stackunits.StackUnit;

import java.util.HashMap;
import java.util.Map;

public class ExecutionContextConstant implements ExecutionContext {
    Map<String, StackUnit> variables;
    public ExecutionContextConstant(){
        variables = new HashMap<>();
    }
    @Override
    public StackUnit getNumberOnName(String name) throws UseConstantException {
        StackUnit number = variables.get(name);
        if(number == null)
            throw UseConstantException.buildNotDefineConstant(name);
        return number;
    }

    public void addNewConstant(String name, double value) throws UseConstantException {
        StackUnit unit = variables.putIfAbsent(name, new Constant(name, value));
        if(unit != null){
            throw UseConstantException.buildReDefine(name);
        }
    }
}
