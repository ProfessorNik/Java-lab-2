package com.stackcalculator.standart.factory;

import com.stackcalculator.standart.Command;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Properties;

public class StandardCommandFactory implements CommandFactory{
    private final Properties commands;

    private StandardCommandFactory(){
        commands = new Properties();
    }

    @Override
    public Command build(String commandName, List<String> args) {
        String commandPath = commands.getProperty(commandName);
        Command command = null;
        try {
            Constructor<?> constructor = Class.forName(commandPath).getConstructor(List.class);
            command = (Command) constructor.newInstance(args);
            return command;
        } catch (ClassNotFoundException |
                InvocationTargetException |
                InstantiationException |
                IllegalAccessException |
                NoSuchMethodException e) {
            //TODO exception
            e.printStackTrace();
        }
        return command;
    }


    public void include(String fileName){
        try(FileReader reader = new FileReader(fileName)) {
            commands.load(reader);
        }catch (IOException ex){
            //TODO exception
            ex.printStackTrace();
        }
    }
}
