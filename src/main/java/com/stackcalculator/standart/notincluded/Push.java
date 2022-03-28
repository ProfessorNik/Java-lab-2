package com.stackcalculator.standart.notincluded;

import com.stackcalculator.exceptions.commands.IllegalNumArgsException;
import com.stackcalculator.exceptions.memory.UseConstantException;
import com.stackcalculator.memory.ExecutionContext;
import com.stackcalculator.memory.NumberStack;
import com.stackcalculator.memory.stackunits.StackUnit;
import com.stackcalculator.standart.Command;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Push implements Command {
    private final String variable;
    private final Logger logger = LogManager.getLogger(Push.class);

    public Push(List<String> args) throws IllegalNumArgsException {
        if(args.size() != 1){
            throw IllegalNumArgsException.build(args.size(), 1);
        }

        variable = args.get(0);
    }

    @Override
    public void exec(NumberStack stack, ExecutionContext context) throws UseConstantException {
        StackUnit num = context.getUnitByArg(variable);
        stack.push(num);
        logger.log(Level.TRACE, context.getNumberCurExecutableString() + ": "
        + num.toString() + " pushed");
    }
}
