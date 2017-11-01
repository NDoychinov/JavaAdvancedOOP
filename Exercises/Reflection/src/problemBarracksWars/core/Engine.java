package problemBarracksWars.core;

import problemBarracksWars.contracts.*;
import problemBarracksWars.contracts.Runnable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

public class Engine implements Runnable {

    private Repository repository;
    private UnitFactory unitFactory;
    private CommandInterpreter commandInterpreter;

    public Engine(Repository repository, UnitFactory unitFactory,
                  CommandInterpreter commandInterpreter) {
        this.repository = repository;
        this.unitFactory = unitFactory;
        this.commandInterpreter = commandInterpreter;
    }

    @Override
    public void run() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        while (true) {
            try {
                String input = reader.readLine();
                String[] data = input.split("\\s+");
                String commandName = data[0];
                Executable exe = this.commandInterpreter.interpretCommand(data, commandName);
                String result = exe.execute();
                if (result.equals("fight")) {
                    break;
                }
                System.out.println(result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
