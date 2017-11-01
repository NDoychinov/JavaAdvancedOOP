package bg.softuni.factories.coreFactory;

import bg.softuni.models.cores.Core;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 4.8.2016 г..
 */
public class CoreFactoryImpl implements CoreFactory {

    private static final String CORE_PACKAGE = "bg.softuni.models.cores.";
    private static final String FAILURE_EXCEPTION_MESSAGE = "Failed to create Core!";

    private char currentName;

    public CoreFactoryImpl() {
        this.currentName = 'A';
    }

    @Override
    public Core createCore(String type, int durability) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {

        try {
            String className = CORE_PACKAGE + type + "Core";
            Class<?> coreClass = Class.forName(className);
            Constructor ctor = coreClass.getConstructor(String.class, int.class);
            return (Core) ctor.newInstance(this.getCurrentName(), durability);
        } catch (ClassNotFoundException nsme) {
            throw new IllegalArgumentException(FAILURE_EXCEPTION_MESSAGE);
        }
    }

    private String getCurrentName() {
        return Character.toString(this.currentName++);
    }
}
