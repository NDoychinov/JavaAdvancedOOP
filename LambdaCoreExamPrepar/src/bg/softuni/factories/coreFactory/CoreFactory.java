package bg.softuni.factories.coreFactory;

import bg.softuni.models.cores.Core;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 4.8.2016 г..
 */
public interface CoreFactory {
    Core createCore(String type, int durability) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException;
}
