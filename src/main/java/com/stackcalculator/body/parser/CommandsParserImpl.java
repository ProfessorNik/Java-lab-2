package com.stackcalculator.body.parser;

import java.io.Reader;
import java.util.Scanner;

public class CommandsParserImpl implements CommandsParser{
    private Scanner reader;

    public CommandsParserImpl(Reader reader){
        this.reader = new Scanner(reader);
    }

    static class CommandsParserImplBuilder{

    }
}
