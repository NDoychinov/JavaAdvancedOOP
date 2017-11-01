package bg.softuni.commands;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 4.8.2016 г..
 */
public abstract class Command implements Executable {

    @Override
    public abstract String execute() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException;
}
