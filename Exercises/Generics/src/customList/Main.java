package customList;

import customList.commands.CommandInterpreter;
import customList.interfaces.Executable;
import customList.interfaces.Interpreter;
import customList.interfaces.MyList;
import customList.myList.MyListImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 15.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        MyList<String> myList = new MyListImpl<String>();
        Interpreter interpreter = new CommandInterpreter(myList);
        String command = sc.readLine().trim();

        while (!command.equals("END")) {
            String[] data = command.split("\\s+");

            Executable exe = interpreter.interpretCommand(data[0], data);
            String result = exe.execute();

            System.out.println(result);
            command = sc.readLine().trim();
        }
    }
}
