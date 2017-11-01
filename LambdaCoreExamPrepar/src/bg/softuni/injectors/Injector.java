package bg.softuni.injectors;


import bg.softuni.commands.Executable;

/**
 * Created by Niki on 6.8.2016 г..
 */
public interface Injector {

    void injectDependency(Executable executable, Class executableClass) throws IllegalAccessException;
}
