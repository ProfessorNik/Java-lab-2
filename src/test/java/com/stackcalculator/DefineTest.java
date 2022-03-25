package com.stackcalculator;

import com.stackcalculator.exceptions.commands.IllegalNumArgsException;
import com.stackcalculator.standart.notincluded.Define;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DefineTest {
    @Test
    public void define(){
        String [] lowArgs = {"a"};
        String [] maxArgs = {"a", "b", "10"};
        String [] noLiterArgs = {"a", "b"};

        IllegalNumArgsException thrown = assertThrows(IllegalNumArgsException.class,
                () -> new Define(Arrays.stream(lowArgs).toList()));
    }
}
