package com.stackcalculator.standart.factory;

import com.stackcalculator.standart.Command;

import java.util.List;

public interface CommandFactory {
    Command build(String commandName, List<String> args) throws ClassNotFoundException;
}
