package bg.softuni.commands;

import bg.softuni.factories.coreFactory.CoreFactory;
import bg.softuni.factories.fragmentFactory.FragmentFactory;
import bg.softuni.injectors.DependencyInjector;
import bg.softuni.injectors.Injector;
import bg.softuni.repository.Repository;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 4.8.2016 г..
 */
public class CommandInterpreter implements Interpreter {

    private static final String PACKAGE_PATH = "bg.softuni.commands.";

    private String[] data;
    private CoreFactory coreFactory;
    private FragmentFactory fragmentFactory;
    private Repository repository;
    private Injector dependencyInjector;

    public CommandInterpreter(CoreFactory coreFactory, FragmentFactory fragmentFactory, Repository
            repository) {
        this.setCoreFactory(coreFactory);
        this.setFragmentFactory(fragmentFactory);
        this.setRepository(repository);
        this.setDependencyInjector(new DependencyInjector(this));
    }

    private void setCoreFactory(CoreFactory coreFactory) {
        this.coreFactory = coreFactory;
    }

    private void setFragmentFactory(FragmentFactory fragmentFactory) {
        this.fragmentFactory = fragmentFactory;
    }

    private void setRepository(Repository repository) {
        this.repository = repository;
    }

    private void setData(String[] data) {
        this.data = data;
    }

    private void setDependencyInjector(Injector dependencyInjector) {
        this.dependencyInjector = dependencyInjector;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) throws ClassNotFoundException,
            NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        try {
            this.setData(data);

            String className = PACKAGE_PATH + commandName + "Command";
            Class<?> classToExecute = Class.forName(className);
            Constructor ctor = classToExecute.getConstructor();
            Executable exe = (Executable) ctor.newInstance();
            this.dependencyInjector.injectDependency(exe, classToExecute);
            return exe;
        } catch (NoClassDefFoundError | ClassNotFoundException e) {
            return unvalidCommandCreater();
        }
    }

    private Executable unvalidCommandCreater() {
        return new UnvalidCommand();
    }
}
