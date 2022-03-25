package com.stackcalculator.body.parser;

public interface CommandsReader {
    String getNextLine();
    boolean eof();
}
