package customList.commands;

import customList.interfaces.Executable;
import customList.interfaces.Interpreter;
import customList.interfaces.MyList;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 15.7.2016 г..
 */
public class CommandInterpreter implements Interpreter {

    private static final String PACKAGE_PATH = "customList.commands.";

    private MyList list;

    public CommandInterpreter(MyList list) {
        this.list = list;
    }

    @Override
    public Executable interpretCommand(String commandName, String[] data) throws ClassNotFoundException,
            NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String className = PACKAGE_PATH + commandName + "Command";
        Class<?> commandClass = Class.forName(className);
        Constructor ctor = commandClass.getConstructor(String[].class, MyList.class);
        return (Executable) ctor.newInstance(data, this.list);

    }
}
