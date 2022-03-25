package com.stackcalculator.body;

import com.stackcalculator.exceptions.body.CLineParseException;

public class CLineParser {
    private String fileName = "";
    private boolean noArgs = false;


    public CLineParser(String[] args) throws CLineParseException {
        parse(args);
    }

    public void parse(String[] args) throws CLineParseException {
        if(args.length == 1)
            fileName = args[0];
        else if(args.length == 0)
            noArgs = true;
        else
            throw new CLineParseException("a lot of arguments");
    }

    public String getFileName(){
        return fileName;
    }

    public boolean hasFileName(){
        return !noArgs;
    }
}
