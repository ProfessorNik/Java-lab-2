package com.stackcalculator.standart.notincluded;

import com.stackcalculator.exceptions.commands.CommandException;
import com.stackcalculator.exceptions.commands.IllegalNumArgsException;
import com.stackcalculator.exceptions.memory.UnableGettingUnitException;
import com.stackcalculator.memory.ExecutionContext;
import com.stackcalculator.memory.NumberStack;
import com.stackcalculator.standart.Command;

import java.util.List;

public class Pop implements Command {
    public Pop(List<String> args) throws IllegalNumArgsException {
        if(args.size() != 2){
            throw IllegalNumArgsException.build(args.size(), 0);
        }
    }

    @Override
    public void make(NumberStack stack, ExecutionContext context) throws CommandException {
        try {
            stack.pop();
        } catch (UnableGettingUnitException e) {
            throw new CommandException("unable pop element: " + e.getMessage());
        }
    }
}
