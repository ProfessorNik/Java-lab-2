package com.stackcalculator.standart.notincluded;

import com.stackcalculator.exceptions.commands.IllegalNumArgsException;
import com.stackcalculator.exceptions.memory.UseConstantException;
import com.stackcalculator.memory.ExecutionContext;
import com.stackcalculator.memory.NumberStack;
import com.stackcalculator.standart.Command;

import java.util.List;

public class Define implements Command {
    private final String name;
    private final String num;

//    private static final Logger log = LogManager.getLogger(Define.class);

    public Define(List<String> args) throws IllegalNumArgsException {
        if(args.size() != 2){
            throw IllegalNumArgsException.build(args.size(), 2);
        }
        name = args.get(0);
        num = args.get(1);
        
//        log.log(Level.TRACE, "was create");
    }

    @Override
    public void make(NumberStack stack, ExecutionContext context) throws UseConstantException {
        context.addNewConstant(name, Double.parseDouble(num));
    }
}
