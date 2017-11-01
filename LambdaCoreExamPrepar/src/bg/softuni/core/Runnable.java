package bg.softuni.core;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 4.8.2016 г..
 */
public interface Runnable {

    void run() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException;
}
