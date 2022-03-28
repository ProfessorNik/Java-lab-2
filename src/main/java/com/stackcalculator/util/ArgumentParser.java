package com.stackcalculator.util;

import com.stackcalculator.exceptions.memory.UseConstantException;
import com.stackcalculator.memory.stackunits.StackUnit;

public interface ArgumentParser {
    StackUnit getUnit(String arg) throws UseConstantException;
    boolean hasValidNameConstant(String name);
}
