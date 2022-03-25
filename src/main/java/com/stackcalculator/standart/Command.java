package com.stackcalculator.standart;

import com.stackcalculator.exceptions.commands.CommandException;
import com.stackcalculator.exceptions.memory.ExecutionEnvironmentException;
import com.stackcalculator.memory.ExecutionContext;
import com.stackcalculator.memory.NumberStack;

public interface Command {
    void make(NumberStack stack, ExecutionContext context) throws ExecutionEnvironmentException, CommandException;
}
