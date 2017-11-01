package customList.interfaces;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 15.7.2016 г..
 */
public interface Interpreter {

    Executable interpretCommand(String commandName, String[] data) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
}
