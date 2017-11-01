package problemBarracksWars;

import problemBarracksWars.contracts.CommandInterpreter;
import problemBarracksWars.contracts.Repository;
import problemBarracksWars.contracts.Runnable;
import problemBarracksWars.contracts.UnitFactory;
import problemBarracksWars.core.Engine;
import problemBarracksWars.core.commands.CommandInterpreterImpl;
import problemBarracksWars.core.factories.UnitFactoryImpl;
import problemBarracksWars.data.UnitRepository;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, InvocationTargetException {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();
        CommandInterpreter commandInterpreter = new CommandInterpreterImpl(repository, unitFactory);
        Runnable engine = new Engine(repository, unitFactory, commandInterpreter);
        engine.run();
    }
}
