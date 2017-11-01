package bg.softuni.commands;

import bg.softuni.annotations.Inject;
import bg.softuni.factories.coreFactory.CoreFactory;
import bg.softuni.models.cores.Core;
import bg.softuni.repository.Repository;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 4.8.2016 г..
 */
public class CreateCoreCommand extends Command {

    @Inject
    private String[] data;

    @Inject
    private CoreFactory coreFactory;

    @Inject
    private Repository repository;

    @Override
    public String execute() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        try {
            Core createdCore = this.coreFactory.createCore(this.data[1],
                    Integer.parseInt(this.data[2]));
            this.repository.addCore(createdCore);
            return String.format("Successfully created Core %s!", createdCore.getName());

        } catch (IllegalArgumentException iae) {
            return iae.getMessage();
        }
    }
}
