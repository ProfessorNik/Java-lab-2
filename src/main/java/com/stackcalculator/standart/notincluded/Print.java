package com.stackcalculator.standart.notincluded;

import com.stackcalculator.exceptions.commands.CommandException;
import com.stackcalculator.exceptions.commands.IllegalNumArgsException;
import com.stackcalculator.exceptions.memory.UnableGettingUnitException;
import com.stackcalculator.memory.ExecutionContext;
import com.stackcalculator.memory.NumberStack;
import com.stackcalculator.memory.stackunits.StackUnit;
import com.stackcalculator.standart.Command;

import java.io.PrintWriter;
import java.util.List;

public class Print implements Command {
    public Print(List<String> args) throws IllegalNumArgsException {
        if(args.size() != 0){
            throw IllegalNumArgsException.build(args.size(), 0);
        }
    }

    @Override
    public void make(NumberStack stack, ExecutionContext context) throws CommandException {
        StackUnit num = null;
        try {
            num = stack.peek();
        } catch (UnableGettingUnitException e) {
            throw new CommandException("unable print value: " + e.getMessage());
        }
        PrintWriter writer = new PrintWriter(System.out);
        writer.println(num);
    }
}
