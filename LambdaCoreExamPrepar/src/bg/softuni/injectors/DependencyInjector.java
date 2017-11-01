package bg.softuni.injectors;


import bg.softuni.annotations.Inject;
import bg.softuni.commands.Executable;
import bg.softuni.commands.Interpreter;

import java.lang.reflect.Field;

/**
 * Created by Niki on 6.8.2016 г..
 */
public class DependencyInjector implements Injector {

    private Interpreter interpreter;

    public DependencyInjector(Interpreter interpreter) {
        this.setInterpreter(interpreter);
    }

    private void setInterpreter(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    @Override
    public void injectDependency(Executable executable, Class executableClass) throws IllegalAccessException {
        Field[] executableClassFields = executableClass.getDeclaredFields();
        Field[] interpreterFields = this.interpreter.getClass().getDeclaredFields();

        for (Field executableClassField : executableClassFields) {
            if (!executableClassField.isAnnotationPresent(Inject.class)) {
                continue;
            }

            executableClassField.setAccessible(true);

            for (Field interpreterField : interpreterFields) {
                if (!interpreterField.getType().equals(executableClassField.getType())) {
                    continue;
                }

                interpreterField.setAccessible(true);

                executableClassField.set(executable, interpreterField.get(this.interpreter));
            }
        }
    }
}
