package com.stackcalculator.memory.stackunits;

public class Constant implements StackUnit{
    private final double value;
    private final String name;

    public Constant(String name, double value){
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return name;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public void setValue(double value) {
        //TODO exception
    }
}
