package com.stackcalculator.standart.notincluded;

import com.stackcalculator.exceptions.commands.IllegalNumArgsException;
import com.stackcalculator.exceptions.memory.UseConstantException;
import com.stackcalculator.memory.ExecutionContext;
import com.stackcalculator.memory.NumberStack;
import com.stackcalculator.memory.stackunits.StackUnit;
import com.stackcalculator.standart.Command;

import java.util.List;

public class Push implements Command {
    private final String variable;

    public Push(List<String> args) throws IllegalNumArgsException {
        if(args.size() != 1){
            throw IllegalNumArgsException.build(args.size(), 1);
        }

        variable = args.get(0);
    }

    @Override
    public void make(NumberStack stack, ExecutionContext context) throws UseConstantException {
        StackUnit num = context.getNumberOnName(variable);
        stack.push(num);
    }
}
