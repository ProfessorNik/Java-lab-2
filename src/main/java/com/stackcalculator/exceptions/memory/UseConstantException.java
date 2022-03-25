package com.stackcalculator.exceptions.memory;

public class UseConstantException extends ExecutionEnvironmentException{
    public UseConstantException() {
        super();
    }

    public UseConstantException(String massage) {
        super(massage);
    }

    public static UseConstantException buildReDefine(String name){
        return new UseConstantException("constant with name " + name + " define early");
    }

    public static UseConstantException buildNotDefineConstant(String name){
        return new UseConstantException("constant with name " + name + " not defined");
    }
}
