package bg.softuni;

import bg.softuni.core.Engine;
import bg.softuni.core.Runnable;
import bg.softuni.io.reader.ConsoleReader;
import bg.softuni.io.reader.Reader;
import bg.softuni.io.writer.ConsoleWriter;
import bg.softuni.io.writer.Writer;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 3.8.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, InvocationTargetException {
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();
        Runnable engine = new Engine(reader, writer);
        engine.run();
    }
}
