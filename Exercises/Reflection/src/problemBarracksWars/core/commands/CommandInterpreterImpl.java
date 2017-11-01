package problemBarracksWars.core.commands;

import problemBarracksWars.contracts.CommandInterpreter;
import problemBarracksWars.contracts.Executable;
import problemBarracksWars.contracts.Repository;
import problemBarracksWars.contracts.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 3.8.2016 г..
 */
public class CommandInterpreterImpl implements CommandInterpreter {

    private static final String PACKAGE_PATH = "problemBarracksWars.core.commands.";

    private Repository repository;
    private UnitFactory unitFactory;

    public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) throws ClassNotFoundException,
            NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String fixedCommandName = Character.toUpperCase(commandName.charAt(0)) +
                commandName.substring(1, commandName.length());
        Class<?> command = Class.forName(PACKAGE_PATH + fixedCommandName + "Command");

        Constructor ctor = command.getConstructor(String[].class,
                Repository.class,
                UnitFactory.class);

        return (Executable) ctor.newInstance(data, this.repository, this.unitFactory);
    }
}
